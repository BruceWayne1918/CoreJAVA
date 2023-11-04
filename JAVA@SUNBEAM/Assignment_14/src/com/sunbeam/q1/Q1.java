package com.sunbeam.q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Q1 {

	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/JDBC";
	public static final String DB_USER = "D5_80720_RAJDEEP";
	public static final String DB_PASSWORD = "sunbeam";

	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD))

		{

			boolean flag = true;
			while (flag) {

				switch (MyMenu.menu1())

				{
				case INSERT:
//					con.setAutoCommit(false);
					String sql = "insert into candidates values (null,?,?,?);"; // parameterized query

					try (PreparedStatement stmt = con.prepareStatement(sql))

					{

						System.out.print("Enter Candidate Name : ");
						String name = sc.next();

						String sql1 = "SELECT name FROM candidates";
						try (PreparedStatement stmt1 = con.prepareStatement(sql1)) {

							try (ResultSet rs = stmt1.executeQuery()) {
								while (rs.next()) {
									String temp = rs.getString("name");
									//									System.out.println(temp);
									//									System.out.println(name);
									if (temp.equals(name)) {
										System.out.println("Entered candidate is already in the table!");
										name = "";
										break;
									}

								}
							} // rs.close();

						}

						if (name != "") {
							System.out.print("Enter Candidate party : ");
							String party = sc.next();

							System.out.print("Enter Candidate votes : ");
							int votes = sc.nextInt();

							stmt.setString(1, name);
							stmt.setString(2, party);
							stmt.setInt(3, votes);

							int count = stmt.executeUpdate();
//							con.setAutoCommit(true);
						}

					} // rs.close();

					// stmt.close();
					catch (Exception e) {
//						con.rollback();
						System.out.println("ERROR...");
						System.out.println("");
						e.printStackTrace();
					}

					break;
				case DISPLAY:
					sql = "Select * from candidates";
					try (PreparedStatement stmt = con.prepareStatement(sql)) {
						try (ResultSet rs = stmt.executeQuery()) {
							while (rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getNString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.println(
										"--------------------------------------------------------------------------------------------------------------");
								System.out.println(" | ID : " + id + " |\n"+" | NAME : " + name + " |\n"+" | PARTY : " + party
										+ " |\n"+" | VOTES : " + votes);

							}

						}
					} catch (Exception e) {
						System.out.println("ERROR!");
					}

					break;
				case INCREMENT_VOTES:
					
					sql="update candidates set votes = votes+? where id = ?";
					
					try (PreparedStatement stmt=con.prepareStatement(sql)){
						System.out.println("Enter id : ");
						int id=sc.nextInt();
						
						System.out.println("Enter votes to increment : ");
						int votes =sc.nextInt();
						
								
						
						stmt.setInt(1, votes);
						stmt.setInt(2, id);
						stmt.executeUpdate();
						
							
						}
					
					break;
					
				case DELETE_CANDIDATE:
					
					sql="Delete from candidates where id = ?";
					
					try (PreparedStatement stmt=con.prepareStatement(sql))
					{
						System.out.println("Enter id : ");
						int id=sc.nextInt();
					
						
						stmt.setInt(1, id);
						stmt.executeUpdate();
						
							
					}

					break;
				case FIND_CANDIDAYE_BY_ID:
					sql="select * from candidates where id = ?";
		
					try(PreparedStatement stmt3=con.prepareStatement(sql)){
						System.out.println("Enter id to search : ");
						int id =sc.nextInt();
						stmt3.setInt(1,id);

						try(ResultSet res= stmt3.executeQuery())
						{	res.next();
//							System.out.println(res.getInt("id"));
//							while(res.next())
//							{
//								System.out.println(res.getInt("id"));
								id=res.getInt("id");
								String name=res.getString("name");
								String party=res.getString("party");
								int votes=res.getInt("votes");
								System.out.println(
										"--------------------------------------------------------------------------------------------------------------");
								System.out.println("ID : " + id + " | NAME : " + name + " | PARTY : " + party
										+ " | VOTES : " + votes);
//							}

						}
						
					}
					catch (Exception e) {
//						con.rollback();
						System.out.println("ERROR...Please Enter Valid ID");
//						System.out.println("");
//						e.printStackTrace();
					}

					break;
					
				case FIND_CANDIDATE_BY_PARTY:
					
					sql="select * from candidates where party = ?";
					
					try(PreparedStatement stmt3=con.prepareStatement(sql))
					{
						System.out.println("Enter party to find candidates : ");
						String id =sc.nextLine();
						stmt3.setString(1,id);

						try(ResultSet res= stmt3.executeQuery())
						{	

								while(res.next()) {
								id=Integer.toString(res.getInt("id"));
								String name=res.getString("name");
								String party=res.getString("party");
								int votes=res.getInt("votes");
								System.out.println(
										"--------------------------------------------------------------------------------------------------------------");
								System.out.println("ID : " + id + " | NAME : " + name + " | PARTY : " + party
										+ " | VOTES : " + votes);


						}
						
					}
					catch (Exception e) {

						System.out.println("ERROR...Please Enter Valid PARTY");

					}}

					break;
					
				case DISPLAY_TOT_VOTES_FOR_EACH_PARTY:
					sql="select party,sum(votes) as TOTAL_VOTES from candidates group by party;";
					
					try {
						Statement stmt4=con.createStatement();
						ResultSet res=stmt4.executeQuery(sql);
						while(res.next())
						{
							String  party=res.getString("party");
							
							int sum=res.getInt("TOTAL_VOTES");
							System.out.println(party+" "+sum);
							
				
						}
						
						
					} catch (Exception e) {
						
						e.printStackTrace();
					}

					break;

				case EXIT:
					flag = false;
					System.out.println("BYE BYE!");
					break;

					

				}
			}
		} // con.close();

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
