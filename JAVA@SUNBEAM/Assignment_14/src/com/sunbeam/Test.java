package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;





//import com.mysql.cj.xdevapi.Statement;

public class Test {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","D5_80720_RAJDEEP","sunbeam" )) {
	
		try(Statement stmt = con.createStatement()) 
		{
			
			System.out.print("Enter min votes: ");
			String minVotes = sc.nextLine();
				
			String sql = "SELECT * FROM candidates WHERE votes > " + minVotes;
			System.out.println("Query: " + sql);
			
			try(ResultSet rs = stmt.executeQuery(sql)) 
			
			{
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
				}
			} // rs.close();
		
		} // stmt.close(); 
		
	} // con.close(); 
	catch (Exception e) {
		e.printStackTrace();
	}
	
}


}
