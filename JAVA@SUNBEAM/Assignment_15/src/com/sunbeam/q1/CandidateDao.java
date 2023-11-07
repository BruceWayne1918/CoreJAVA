package com.sunbeam.q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.sunbeam.q1.exceptions.CandidateNotFoundException;



public class CandidateDao implements AutoCloseable {
	private Connection con;
	private PreparedStatement stmtSave,stmtUpdate,stmtDeleteById,stmtFindById,stmtFindAll,stmtFindByParty;
	private int rs;
	private PreparedStatement stmtPartyWiseVotes;
	
	public CandidateDao() throws Exception 
	{
		con = DbUtil.getConnection();
		
		stmtSave = con.prepareStatement("INSERT INTO candidates VALUES(default,?,?,?)");
		stmtUpdate = con.prepareStatement("UPDATE candidates SET name=?, party=?, votes=? WHERE id=?");
		stmtDeleteById = con.prepareStatement("DELETE FROM candidates WHERE id=?");
		stmtFindById = con.prepareStatement("SELECT * FROM  candidates where id=?");
		stmtFindAll = con.prepareStatement("select * from candidates");
		stmtFindByParty = con.prepareStatement("select * from candidates where party=?");
		stmtPartyWiseVotes=con.prepareStatement("select party,sum(votes) as VOTES from candidates group by party ");
		
	}
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int save(Candidate c) throws CandidateNotFoundException, Exception {
//		String sql = "INSERT INTO candidates VALUES(default,?,?,?)";
		stmtSave.setString(1, c.getName());
		stmtSave.setString(2, c.getParty());
		stmtSave.setInt(3, c.getVotes());
		int count = stmtSave.executeUpdate();
		if(count!=1) {
			throw new Exception();
		}
		return count;
	}
	public int update(Candidate c) throws CandidateNotFoundException,Exception 
	
	{	int count = 0;

		
		try 
		{	
			stmtUpdate.setString(1, c.getName());
			stmtUpdate.setString(2, c.getParty());
			stmtUpdate.setInt(3, c.getVotes());
			stmtUpdate.setInt(4, c.getId());
			
			
			count = stmtUpdate.executeUpdate();
			stmtUpdate.close();
			
			if(count!=1) {
				throw new CandidateNotFoundException();
			}
		}
			
		
		
		catch (CandidateNotFoundException err)
		{
			err.printStackTrace();
			
		}
		return count;
		
		}
	public int deleteById(int id) throws SQLException, CandidateNotFoundException 	
	{
			
			stmtDeleteById.setInt(1, id);
			int rs = stmtDeleteById.executeUpdate(); 
		
			stmtFindAll.close();	
		
			
			return rs;
	}
	
	
	public List<Candidate> findById(int id) throws SQLException,CandidateNotFoundException 
	{
		{
			List<Candidate> list = new ArrayList<Candidate>();
			stmtFindById.setInt(1, id);
			try(ResultSet rs = stmtFindById.executeQuery()) {
				
				while(rs.next()) 
				{
					if(id==(rs.getInt("id"))) {
						String name = rs.getString("name");
						String party = rs.getString("party");
						int votes = rs.getInt("votes");
						Candidate c = new Candidate(id, name, party, votes);
						list.add(c);
					}
					else{
						throw new CandidateNotFoundException();
					}
				}
			}
			stmtFindAll.close();
			return list;
		}
	}
	public List<Candidate> findAll() throws Exception 
	{
		List<Candidate> list = new ArrayList<Candidate>();
		
		try(ResultSet rs = stmtFindAll.executeQuery()) {
			
			while(rs.next()) 
			{
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String party = rs.getString("party");
				int votes = rs.getInt("votes");
				Candidate c = new Candidate(id, name, party, votes);
				list.add(c);
			}
		}
		
		return list;
	}
	
	
	public List<Candidate> findByParty(String party) throws Exception 
	
	{
		List<Candidate> list = new ArrayList<Candidate>();
		
			stmtFindByParty.setString(1, party);
			try(ResultSet rs = stmtFindByParty.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
			stmtFindById.close();
		return list;
	}
	
public  HashMap<String, Integer> getPartyWiseVotes() throws Exception 
	
	{
	HashMap<String, Integer> map = new HashMap<>();
			try(ResultSet rs = stmtPartyWiseVotes.executeQuery()) {
				while(rs.next()) {
					int sumVotes = rs.getInt("VOTES");
					
					String party = rs.getString("party");
					
					map.put(party, sumVotes);
				
				}
			} // rs.close();
			stmtFindById.close();
		return map;
	}
	
}
