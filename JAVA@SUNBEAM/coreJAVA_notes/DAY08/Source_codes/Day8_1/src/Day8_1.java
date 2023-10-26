// equals() , == , hashcode()
//in this example Employee class is not having equals() overridden


class Employee
{
	private String name;
	private int id;
	private int age;
	public Employee() 
	{
		
	}
	public Employee(String name, int id, int age) 
	{
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	
	
	
}
public class Day8_1 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee("emp1",1,35);
		Employee e2 = new Employee("emp1",1,35);
		Employee e3 = e1; // reference copy
		System.out.println("E1 = "+e1);
		System.out.println("E2 = "+e2);
		System.out.println("E3 = "+e3);
		
		System.out.println("E1 == E2 "+(e1==e2)); // false
		System.out.println("E1 == E3 "+(e1==e3)); // true
		
		System.out.println("E1 equals E2 "+e1.equals(e2)); // false
		// in this case we don't have equals() inside Employee class
		// so equals() will be called from Object class
		
		System.out.println("E1 equals E3 "+e1.equals(e3)); // true
		
		
	}

}
