import java.util.Scanner;

class Employee
{
	private String name;
	private int empid;
	private int deptid;
	private float salary;
	private String desg;
	
	void accept_record() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		name = sc.next();
		System.out.println("Enter EMPID = ");
		empid= sc.nextInt();
		System.out.println("Enter Dept ID = ");
		deptid= sc.nextInt();
		System.out.println("Enter Salary = ");
		salary= sc.nextFloat();
		System.out.println("Enter designation = ");
		desg= sc.next();
	
	}
	
	void disp()
	{
		System.out.println("Name = "+name+" Empid = "+empid+" Dept id = "+deptid);
		System.out.println("Salary = "+salary+" Designation = "+desg);
	}
	
	void setSalary(int newsal)
	{
		salary = newsal;
	}
	
}
public class Day4_1 {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.accept_record(); // accept_record() is called upon e1 object
		e1.disp(); // disp() is called upon e1 object
		// modify the salary of e1 object
		e1.setSalary(99999); //setSalary() is called upon e1 object
		e1.disp();
		
	}

}
