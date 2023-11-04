package com.sunbeam.q2;

import java.sql.*;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Users {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/JDBC";
	public static final String DB_USER = "D5_80720_RAJDEEP";
	public static final String DB_PASSWORD = "sunbeam";
	
	
	static {
		try {Class.forName(DB_DRIVER);
			
		}
		catch(Exception e){
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String sql="insert into users values(default,'raj','sutar','raj@gmail.com','0736',?,1,'ceo');" ;
		
		
		
		try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD))
		{
				try(PreparedStatement sqlStatement=con.prepareStatement(sql))
				{
				System.out.println("ENTER DAY :");
				int day=sc.nextInt();
				
				System.out.println("ENTER MONTH :");
				int month=sc.nextInt();

				System.out.println("ENTER YEAR :");
				int year=sc.nextInt();
				
				String date = day+"/"+month+"/"+year;
				
				SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
				
				java.util.Date uDate = sdf.parse(date);
				
				java.sql.Date sDate=new java.sql.Date(uDate.getTime());//converts date and todays date difference in mili sec return long value
				
				
				sqlStatement.setDate(1, sDate);
				
				

			
			
			int resSetCount = sqlStatement.executeUpdate();
			
		
		}}
		catch(Exception e) {
			e.printStackTrace();
		}
		


	}

}
