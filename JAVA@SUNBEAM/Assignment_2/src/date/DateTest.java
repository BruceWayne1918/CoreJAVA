package date;




public class DateTest {
	

	public static void main(String[] args) 
	
	{
		Date D1= new Date();
		Date D2= new Date();
		Date D3= new Date();
		
		D1.acceptDate();
		D2.acceptDate();
		D3.acceptDate();
		
		
		
	
	
		
		D1.dispDate(1);
		
		D2.dispDate(2);
		
		D3.dispDate(3);
		
		
	}
	
	
	
	

}


/*
Q3. Create a class called Date that includes three fields—a month (type int), a day (type int) and a
year (type int). 

Provide a constructor that initializes the three instance variables and assumes that
the values provided are correct.

 Provide a set and a get method for each instance
variable.

 Provide a method displayDate that displays the month, day and year separated by forward
slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.*/