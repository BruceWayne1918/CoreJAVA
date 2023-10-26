import java.util.Scanner;
// fields of the class receives the access specifier as package level

class Employee
{
	int id;
	float salary;

	void acceptRecord()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID ");
		id = sc.nextInt();
		System.out.println("Enter Salary ");
		salary = sc.nextFloat();
	}
	
	void dispRecord()
	{
		System.out.println("Id = "+id+" Salary = "+salary);
		
	}
}



/*
public class Day3_6 {

	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.acceptRecord(); // acceptRecord() is called upon e1 object 
		e1.dispRecord(); //dispRecord() is called upon e1
		

	}

}

*/


/*
public class Day3_6 {

	public static void main(String[] args)
	{
		Employee e1; //reference of type Employee // stack
		e1 = new Employee(); // object of type Employee // heap 
		e1.acceptRecord();
		e1.dispRecord();
		
		
	}
}
*/


//NPE
/*
public class Day3_6 {

	public static void main(String[] args)
	{
		Employee e;//reference
		e=null; // null reference / null object 
		e.acceptRecord(); //trying to call method on null reference
		// NPE(NullPointerException)
		//Calling the instance method of a null object.
		//Accessing or modifying the field of a null object.
		e.dispRecord();//trying to call method on null reference
		
		
	}
}

*/

/*
// Resolve the NPE

public class Day3_6 {

	public static void main(String[] args)
	{
		Employee e;//reference
		e=null; // null reference / null object 
		e=new Employee();
		e.acceptRecord();
		e.dispRecord();
	}
}

*/


/*
public class Day3_6 {

	public static void main(String[] args)
	{
		Employee e;//uninialized reference // local variable
		 //local reference inside main()
		e.acceptRecord(); // javac error 
		e.dispRecord(); // javac error
		
	}
}

*/

/*
// reference copy 
public class Day3_6 {

	public static void main(String[] args)
	{
		Employee e1= new Employee();
		Employee e2=new Employee();
		Employee e3=e1; // reference copy
		e1.acceptRecord();
		e2.acceptRecord();
		e1.dispRecord();
		e2.dispRecord();
		e3.dispRecord();
		
		
		
	}
}

*/


public class Day3_6 {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.acceptRecord();
		e1.dispRecord();
		Employee e2=new Employee();
		e2.acceptRecord();
		e2.dispRecord();
		e1.salary=400000; // field is getting modified outside the class
		// it is not recommended at all
		
		e1.dispRecord();
	}
}



