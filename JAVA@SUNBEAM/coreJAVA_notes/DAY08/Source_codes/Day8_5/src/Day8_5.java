import java.util.Scanner;

//whenever we create object of sub class
// object will get space for all the fields of super + sub class
//e1 object ===> name, age , id , salary

// if we call parameterless constructor of sub class
// parameterless constructor of super class gets called automatically.

// SUPER CLASS PARMAETERLESS / USER DEFINED DEFAULT CONSTRUCTOR 
//GETS CALLED IMPLICITELY  FROM THE SUB CLASS 

// EXPLICIT CALLING 
//if we super() in parameterless cosntructor of sub class , it will
//call parameterless constructor of super class

// Writing of super() is optional inside parameterless cosntructor 

class Person
{
	String name;
	int age;
	Person() // parameterless constructor 
	{
		System.out.println("Inside parameterless constructor of Person classs");
		this.name="DEFAULT";
		this.age=18;
	}
	
	void acceptPersonRecord()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name of person : ");
		this.name=sc.next();
		System.out.println("Enter Age : ");
		this.age=sc.nextInt();
	}
	void dispPersonRecord()
	{
		System.out.println("Name = "+this.name+" Age = "+this.age);
	}
}
// Employee is-a Person
// Employee is sub class
class Employee extends Person
{
	int eid;
	float sal;
	
	Employee()
	{
		super(); // it will call super class parameterless constructor 
		System.out.println("Inside parameterless constructor of Employee classs");
		this.eid=1;
		this.sal=50000;
		
	}
	
	void acceptEmpRecord()
	{
		//super.acceptPersonRecord(); // method is called directly from super class 
		acceptPersonRecord();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID of employee : ");
		this.eid=sc.nextInt();
		System.out.println("Enter salary : ");
		this.sal=sc.nextInt();
	}
	void dispEmpRecord()
	{
		//super.dispPersonRecord(); // calling super class method 
		dispPersonRecord();
		System.out.println("EID = "+this.eid+" Salary = "+this.sal);
	}
}


public class Day8_5 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.dispEmpRecord();
	}

}
