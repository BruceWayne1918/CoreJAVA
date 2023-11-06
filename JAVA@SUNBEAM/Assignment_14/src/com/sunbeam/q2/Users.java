package com.sunbeam.q2;

import java.sql.*;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.sunbeam.q2.exceptions.DuplicateEmailException;
import com.sunbeam.q2.exceptions.IdNotFoundException;

public class Users {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/JDBC";
	public static final String DB_USER = "D5_80720_RAJDEEP";
	public static final String DB_PASSWORD = "sunbeam";
	
	
	static {
		try {Class.forName(DB_DRIVER);// here we have loaded the Driver interface at the time of class loading , to bring all the required interfaces & classes in main memory
			
		}
		catch(Exception e){
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		String sql="insert into users values(default,'raj','sutar','raj@gmail.com','0736',?,1,'ceo');";
		//here we've created the sql statement in string format
		
		
		
		try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD))// creation of collection object 
		
		
		{	boolean flag=true	;
			while(flag) 
			
			
			{
				/*Insert new user (Voter)
					Display all users
					Delete voter with given id
					Change status of voter with given id to true
					Change the name and birth date of voter*/
				switch(MyMenu.menu1())
				{
				case INSERT :
					String sql="insert into users values(default,?,?,?,?,?,?,?);";
					try(PreparedStatement sqlStatement=con.prepareStatement(sql))// then create the prepared statement pbject 
					// by using connection obj .prepareStatement methofd that takes string as argument which is the sql instruction
					{	
						System.out.println("Enter The First Name : ");
						String first_name = sc.next();
						
						System.out.println("Enter The Last Name : ");
						String last_name = sc.next();
						
						System.out.println("Enter The E-mail Address : ");
						String email = sc.next();
						
						String sql1="Select email from users where email=?;";
						try(PreparedStatement stmt1=con.prepareStatement(sql1)){
							stmt1.setString(1, email);
							try(ResultSet res =stmt1.executeQuery())
							{
								if(res.next()!=false)
								{
									throw new DuplicateEmailException();
								}
															
							}
							
							
						}
						
						System.out.println("Enter the Password : ");
						String password=sc.next();
						
						System.out.println("ENTER DAY :");
						int day=sc.nextInt();

						System.out.println("ENTER MONTH :");
						int month=sc.nextInt();

						System.out.println("ENTER YEAR :");
						int year=sc.nextInt();
						
						System.out.println("Enter role : ");
						String role=sc.next();
						
						

						String date = day+"/"+month+"/"+year; // creating the the string of date in format

						SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");// creating simple date format object 
						//

						java.util.Date uDate = sdf.parse(date);//sdf.parse(date) method, which converts the string into a java.util.Date object.

						java.sql.Date sDate=new java.sql.Date(uDate.getTime());//converts date and todays date difference in mili sec return long value

						sqlStatement.setString(1, first_name);
						sqlStatement.setString(2, last_name);
						sqlStatement.setString(3, email);
						sqlStatement.setString(4, password);
						sqlStatement.setDate(5, sDate);
						sqlStatement.setInt(6, 0);
						sqlStatement.setString(7,role);


						int resSetCount = sqlStatement.executeUpdate();


					}
					
					catch(DuplicateEmailException e) 
					{
						System.out.println("ENTERED EMAIL ID ALREADY EXISTS in the table");
					break;}
				break;
				
				
				case DISPLAY :
					sql="SELECT * FROM users;";
					try(PreparedStatement stmt2=con.prepareStatement(sql)){
						try(ResultSet resSet=stmt2.executeQuery()){
							while(resSet.next())
							{
								int id=resSet.getInt("id");
								String first_name=resSet.getString("first_name");
								String last_name=resSet.getString("last_name");
								String email=resSet.getString("email");
								
								java.sql.Date dobSql=resSet.getDate("dob");//we only neeeed to convert Sql date into String to print
								
								SimpleDateFormat sdf;
								sdf=new SimpleDateFormat("dd/MM/yyyy");//create sdf object having particular format in which dates are fetched from table dob column
								
								String dob =sdf.format(dobSql);
								
								int status=resSet.getInt("status");
								String role=resSet.getString("role");
								
								
								System.out.println("--------------------------------------------------------------------------------------------------");
								System.out.println("ID : "+id);
								System.out.println("NAME : "+first_name+" "+last_name);
								System.out.println("EMAIL ID : "+email);
								System.out.println("DOB : "+dob);
								System.out.println("STATUS : "+status+" "+"ROLE : "+role);
							}
						}
					}
					catch (Exception e) {
					System.out.println("ERROR OCCURED!");
					e.printStackTrace();
					}
					break;
					
					
				case DELETE_VOTER_BY_ID :
					
					System.out.println("ENTER ID TO DELETE THE RECORD");
					int id= sc.nextInt();
					sql="SELECT id from users where id=?";
					try(PreparedStatement stmt3=con.prepareStatement(sql)){
						stmt3.setInt(1, id);
						try(ResultSet resSet1=stmt3.executeQuery()){
							if(resSet1.next()==false) {
								throw new IdNotFoundException();
							}
							sql="delete from users where id=?";
							try(PreparedStatement stmt4=con.prepareStatement(sql)){
								stmt4.setInt(1, id);
								int rowsAffected=stmt4.executeUpdate();
								if(rowsAffected!=0)
									System.out.println("DELETED USER!");
							}
							
						}
					}
					
					catch(IdNotFoundException e) 
					{
						e.msg();
					}
					
					
					break;
				case CHANGE_STATUS_BY_ID :
					System.out.println("ENTER ID TO CHANGE STATUS : ");
					id= sc.nextInt();
					
					sql="SELECT id from users where id=?";
					try(PreparedStatement stmt3=con.prepareStatement(sql)){
						stmt3.setInt(1, id);
						try(ResultSet resSet1=stmt3.executeQuery()){
							if(resSet1.next()==false) {
								throw new IdNotFoundException();
							}
							sql="update users set status = ? where id=?;";
							try(PreparedStatement stmt4=con.prepareStatement(sql)){
								stmt4.setBoolean(1, true);
								stmt4.setInt(2, id);
								int rowsAffected=stmt4.executeUpdate();
								if(rowsAffected!=0)
									System.out.println("ROLE CHANGED!");
							}
							
						}
					}
					
					catch(IdNotFoundException e) {
						e.msg();
					}
					
					break;
				case CHANGE_NAME_DOB :
					System.out.println("ENTER ID TO CHANGE STATUS : ");
					id= sc.nextInt();
					
					sql="SELECT id from users where id=?";
					try(PreparedStatement stmt3=con.prepareStatement(sql)){
						stmt3.setInt(1, id);
						try(ResultSet resSet1=stmt3.executeQuery()){
							if(resSet1.next()==false) {
								throw new IdNotFoundException();
							}
							sql="update users set first_name=?,last_name=?,dob=? where id=?;";
							System.out.println("Enter First Name <space> Second Name : ");
							sc.nextLine();
							String fullName=sc.nextLine();
							
							String name[]=fullName.split(" ");
							
							System.out.println("Enter DOB");
							
							System.out.println("ENTER DAY :");
							int day=sc.nextInt();

							System.out.println("ENTER MONTH :");
							int month=sc.nextInt();

							System.out.println("ENTER YEAR :");
							int year=sc.nextInt();
							
							String date = day+"/"+month+"/"+year; // creating the the string of date in format

							SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");// creating simple date format object 
							//

							java.util.Date uDate = sdf.parse(date);//sdf.parse(date) method, which converts the string into a java.util.Date object.

							java.sql.Date sDate=new java.sql.Date(uDate.getTime());//converts date and todays date difference in mili sec return long value

							
							try(PreparedStatement stmt4=con.prepareStatement(sql)){
								stmt4.setString(1, name[0]);
								stmt4.setString(2, name[1]);
								stmt4.setDate(3, sDate);
								stmt4.setInt(4,id);
								
								int rowsAffected=stmt4.executeUpdate();
								if(rowsAffected!=0)
									System.out.println("NAME AND DOB CHANGED!");
							}
							
						}
					}
					
					catch(IdNotFoundException e) {
						e.msg();
					}
					
					break;
				case EXIT :
					flag=false;
					break;
				

				}
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}



	}

}
