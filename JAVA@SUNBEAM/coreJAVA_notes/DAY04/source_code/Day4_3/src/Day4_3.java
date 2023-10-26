import java.util.Scanner;
// Constructor 
// is used to initialize the fields of the class whenever object is created
// construtcor is having same name as the class name
// it is special member function of the class , whose name is same as class name
// it gets called automatically whenever we create object

class Employee
{
	private String name;
	private int empid;
	private int deptid;
	private float salary;
	private String desg;
	
	
	
	
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


/*
public class Day4_3 {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		// just set the name of Employee e1 object
		e1.setName("Akshita");
		System.out.println("Name = "+e1.getName());
		
		
	}

}
*/

public class Day4_3 {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		//whenever we create object of the class
		// fields gets initialized 
		// in this code we have not defined the constructor inside class Employee
		// still the fields are getting initialized
		// it is because DEFAULT CONSTRUCTOR is getting called 
		e1.disp();
	}
}

