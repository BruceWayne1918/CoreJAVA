// toString() is defined inside Employee class
// so it will execute the toString() from Employee class
// in this case it will display name and empid 

class Employee
{
	private String name;
	private int empid;
	private float salary;
	private int deptid;
	
	public Employee() 
	{
		this.name="DEFAULT";
		this.empid=1;
		this.salary=50000;
		this.deptid=1;
		
	}

	public Employee(String name, int empid, float salary, int deptid) {
		
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		this.deptid = deptid;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	void disp()
	{
		System.out.println("Name = "+this.name+" Empid = "+this.empid+" Dept id = "+this.deptid+" Salary = "+this.salary);
	}
	
	public String toString()
	{
		return this.name+" "+this.empid;
	}
	
	
}


public class Day4_11 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Akshita",123,99999,123);
		//e1.disp();
		 // System.out.println(e1.toString()); //toString() is called explicitely
		System.out.println(e1);
		// printing e1 object
		// when we print the object of any class
		// automatically toString() gets called  implicitely
	}

}
