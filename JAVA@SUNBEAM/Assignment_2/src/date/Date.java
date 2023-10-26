package date;

import java.util.Scanner;

public class Date 
{
	int month,day,year;
	
	
	
	public Date()
	{
		this(1,1,2001);
	}

	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	

	public int getMonth() 
	{
		return month;
	}

	
	public void setMonth(int month) {
		this.month = month;
	}
	

	public int getDay() {
		return day;
	}
	

	public void setDay(int day) {
		this.day = day;
	}
	

	public int getYear() {
		return year;
	}
	

	public void setYear(int year) {
		this.year = year;
	}

	public void acceptDate() {
		
		System.out.println("Enter Day : ");
		this.day= new Scanner(System.in).nextInt();
		
		System.out.println("Enter Month : ");
		this.month= new Scanner(System.in).nextInt();
		
		System.out.println("Enter Year : ");
		this.year= new Scanner(System.in).nextInt();
		System.out.println("---------------------------------------------");
			
		
	}

	public void dispDate(int i) {
		
		System.out.println("-------------------------------------------");
		System.out.println("Displaying Date : "+i);
		System.out.println(this.day+"/"+this.month+"/"+this.year);
		System.out.println();
		
		
	}
	
	
	
	

}

/* Q3. Create a class called Date that includes three fields—a month (type int), a day (type int) and a
year (type int). Provide a constructor that initializes the three instance variables and assumes that
the values provided are correct. Provide a set and a get method for each instance
variable. Provide a method displayDate that displays the month, day and year separated by forward
slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.*/