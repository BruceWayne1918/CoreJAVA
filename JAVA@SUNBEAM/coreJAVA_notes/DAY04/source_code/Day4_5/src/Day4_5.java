import java.util.Scanner;
// Constructor Overloading
// in a class if we specify more than one constructor it is called as 
// Constructor overloading


class Employee
{
	private String name;
	private int empid;
	private int deptid;
	private float salary;
	private String desg;
	
	Employee()
	{
		this.name="DEFAULT";
		this.empid=1;
		this.deptid=1;
		this.salary=50000;
		this.desg="TRAINEE";
	}
	// PARAMATRIZED CONSTRUCTOR
	Employee(String name,int empid,int deptid,float salary,String desg)
	{
		this.name =name;
		this.empid= empid;
		this.deptid= deptid;
		this.salary=salary;
		this.desg = desg;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

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
	
	
	
}


public class Day4_5 {

	public static void main(String[] args)
	{
		Employee e1 = new Employee();	
		Employee e2=new Employee("employee2",123,123,60000,"admin");
		Employee e3=new Employee("employee3",456,456,80000,"training");
		e1.disp();
		e2.disp();
		e3.disp();
		
	}
}

