package com.sunbeam.q1;

import java.security.KeyStore.Entry;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.q1.exceptions.CandidateNotFoundException;
import com.sunbeam.q1.menu.MyMenu;



public class Demo01Main

{	



	public static Candidate acceptCandidate(Scanner sc) {


		System.out.print("Enter Id: ");
		int id = sc.nextInt();
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Party: ");
		String party = sc.next();
		System.out.print("Enter Votes: ");
		int votes = sc.nextInt();
		Candidate c = new Candidate(id, name, party, votes);	
		return c;
	}
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		/*
		try(CandidateDao dao = new CandidateDao()) {
			Candidate c = acceptCandidate(sc);
			int count = dao.update(c);
			System.out.println("Rows Updated: " + count);
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		 */



		boolean flag =true;
		while(flag) 
		{
			switch (MyMenu.menu())

			{
			case SAVE:
				System.out.println("---------------------------------------------------------------------------------------------");
				try(CandidateDao dao=new CandidateDao())
				{	

					dao.save(acceptCandidate(new Scanner(System.in)));

				} catch (Exception e2) {
					
					e2.printStackTrace();
				}
				System.out.println("");
				System.out.println("Inserted Successfully!");

				break;

			case UPDATE:
				System.out.println("---------------------------------------------------------------------------------------------");
				try(CandidateDao dao=new CandidateDao()){
					System.out.println("Enter id to update");
					int id =sc.nextInt();

					Candidate c1=acceptCandidate(new Scanner(System.in));

					int affectedRows=dao.update(c1);
					if(affectedRows==0) {

						throw new CandidateNotFoundException();

					}


				} 
				catch (CandidateNotFoundException e1) {

					e1.printStackTrace();
				}
				catch (Exception e1) {

					e1.printStackTrace();
				}
				System.out.println("Updated Successfully!");
				break;



			case DELETE_BY_ID:
				System.out.println("---------------------------------------------------------------------------------------------");

				try(CandidateDao dao=new CandidateDao()){
					System.out.println("Enter id to delete");
					int id =sc.nextInt();
					int affectedRows=dao.deleteById(id);
					if(affectedRows!=1)
					{
						throw new CandidateNotFoundException();
					}
					else {System.out.println("candidate deleted successfully"); }


				} catch (Exception e1) {

					e1.printStackTrace();
				}
				break;


			case FIND_BY_ID:
				System.out.println("---------------------------------------------------------------------------------------------");
				try(CandidateDao dao=new CandidateDao()){
					System.out.println("Enter id to search");
					int id =sc.nextInt();
					List<Candidate>List2=dao.findById(id);

					List2.forEach(c->System.out.println(c));

				} catch (Exception e1) {

					e1.printStackTrace();
				}
				break;



			case FINDALL:
				System.out.println("---------------------------------------------------------------------------------------------");
				try(CandidateDao dao=new CandidateDao()){
					System.out.println("Displaying all candidates");

					List<Candidate>List1=dao.findAll();

					List1.forEach(c->System.out.println(c));

				} catch (Exception e1) {

					e1.printStackTrace();
				}
				break;

			case FIND_BY_PARTY:
				System.out.println("---------------------------------------------------------------------------------------------");
				try(CandidateDao dao = new CandidateDao()) 
				{
					System.out.print("Enter party: ");
					String party = sc.next();
					List<Candidate> list = dao.findByParty(party);
					list.forEach(c -> System.out.println(c));
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case EXIT:
				flag = false;
				System.out.println("BYE BYE!");
				break;
				
				
			case PARTY_WISE_VOTES:
				System.out.println("---------------------------------------------------------------------------------------------");
				try(CandidateDao dao=new CandidateDao())
				{
					
					HashMap<String,Integer> map = dao.getPartyWiseVotes();
					
//					map.forEach(e->System.out.println(e));
					for(java.util.Map.Entry<String, Integer> e:map.entrySet())
					{
						
						System.out.println(e);
					}
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				break;



			}
		}
	}}











