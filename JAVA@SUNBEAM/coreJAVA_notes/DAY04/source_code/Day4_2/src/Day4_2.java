import java.util.Scanner;
// example based on this keyword 
class Employee
{
	private String name;
	private int empid;
	private int deptid;
	private float salary;
	private String desg;
	
	void accept_record()  // facilitators 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		this.name = sc.next();
		System.out.println("Enter EMPID = ");
		this.empid= sc.nextInt();
		System.out.println("Enter Dept ID = ");
		this.deptid= sc.nextInt();
		System.out.println("Enter Salary = ");
		this.salary= sc.nextFloat();
		System.out.println("Enter designation = ");
		this.desg= sc.next();
	
	}
	
	void disp() // facilitators 
	{
		System.out.println("Name = "+this.name+" Empid = "+this.empid+" Dept id = "+this.deptid);
		System.out.println("Salary = "+this.salary+" Designation = "+this.desg);
	}
	
	void setSalary(int salary)  // setters
	{
		this.salary = salary;
	}
	
}
public class Day4_2 {

	public static void main(String[] args)
	{
		Employee e1 =new Employee();
		Employee e2= new Employee();
		e1.accept_record();// this==> e1 
		e2.accept_record(); // accept_record() is called upon e2 object
		// current object e2
		// this ===> e2
		e1.disp();
		e2.disp();
		System.out.println("*******************************");
		e2.setSalary(88888);
		e1.disp();
		e2.disp();
		
	}

}
