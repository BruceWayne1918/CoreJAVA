import java.util.Scanner;

//if we wish to call super class method from sub class method 
// then we use super keyword
// but in this case writing of "super" keyword is optional

//Super class 
class Person
{
	String name;
	int age;
	
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


public class Day8_4 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.acceptEmpRecord();
		e1.dispEmpRecord();
	}

}
