package p1;
//Employee class is in package P1
// main is in package p2
// so if we wish to access the methods of Employee class from p1 to p2
// its our duty to declare the methods of Employee class as public


public class Employee 
{
	private String name;
	private String desg;
	private int id;
	private int age;
	private float salary;
	
	
	public Employee() 
	{
		
	}
	
	
	public Employee(String name, String desg, int id, int age, float salary) 
	{
		
		this.name = name;
		this.desg = desg;
		this.id = id;
		this.age = age;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void disp()
	{
		System.out.println("Name = "+this.name+" Designation = "+this.desg);
		System.out.println("Age = "+this.age+" ID = "+this.id+" Salary = "+this.salary);
	}
	
}
