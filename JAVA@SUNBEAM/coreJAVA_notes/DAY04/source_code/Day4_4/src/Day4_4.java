import java.util.Scanner;
// Constructor 
// whenever object is created please allocate default values specified by the programmer
// in this case we should write constructor
// user defined default constructor / parameterless constructor 

// IF USER HAVE DEFINED PARAMETERLESS CONSTRUCTOR THEN IT GETS CALLED 
// WHEN WE CREATE OBJECT WITHOUT ANY PARAMETERS
// IF USER HAVE NOT DEFINED PARAMETERLESS CONSTRUCTOR THEN
// IT CALLS DEFAULT CONSTRUCTOR

// CONSTRUCTOR
// -it is special member function of the class
// - bcoz its name is same as class name
// - it does not have any return type
// - it get called implicitly
// - no need to call constructor explicit





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


public class Day4_4 {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		// user defined default constructor will be called automatically 
		// IMPLICIT CALL 
		Employee e2=new Employee();
		// user defined default constructor will be called automatically 
		// IMPLICIT CALL 
		
		e1.disp(); 
		// disp() is called upon e1 object 
		// EXPLICIT CALLING  
		//to call disp() we need object on left side 
		e2.disp();
		//disp() is called uponn e2 object
		// EXPLICIT CALLING 
	}
}

