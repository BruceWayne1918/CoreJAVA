import java.util.Scanner;
//current object reference is holded by one keyword "this" keyword
// this ==> means current object 

class Employee
{
	private int id;
	private float salary;

	void acceptRecord()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID ");
		this.id = sc.nextInt();
		System.out.println("Enter Salary ");
		this.salary = sc.nextFloat();
	}
	
	void dispRecord()
	{
		System.out.println("Id = "+this.id+" Salary = "+this.salary);
		
	}
	
	void setSalary(int salary) // setter / mutators 
	{
		this.salary = salary;
	}
	
	float getSalary() // getter / inspector 
	{
		return this.salary;
	}
	
	
	int getID()
	{
		return this.id;
	}
}
public class Day3_8 {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.acceptRecord(); // acceptRecord() is called upon e1 object
		// e1 becomes current object
		
		e1.dispRecord(); //dispRecord() is called upon e1 object
		e1.setSalary(80000); // setSalary() is called upon e1 object
		System.out.println("Salary of Employee one = "+e1.getSalary());
		System.out.println("Employee one ID = "+e1.getID());
		
	}

}
