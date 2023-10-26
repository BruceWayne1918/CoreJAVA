import java.util.Scanner;

// getter and setter
class Employee
{
	private int id;
	private float salary;

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
	
	void setSalary(int newsal) // setter / mutators 
	{
		salary = newsal;
	}
	
	float getSalary() // getter / inspector 
	{
		return salary;
	}
	
	
	int getID()
	{
		return id;
	}
}
public class Day3_7 {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.acceptRecord();
		e1.dispRecord();
		//e1.id=980; // javac error // id is declared as private 
		//e1.salary = 567895; // javac error // salary is declared as private 
		
		e1.setSalary(80000);
		System.out.println("Salary of Employee one = "+e1.getSalary());
		System.out.println("Employee one ID = "+e1.getID());
		// if we don't wish to modify empid 
		// we shall not write setter for it
		
	}

}
