// Method reference to an instance method of an object


@FunctionalInterface
interface MyInterface
{
	void display();
}

public class Day18_9 
{

	 public void m1()
	 {
		System.out.println("This is m1 method inside class");
		System.out.println("Core java programming");
		System.out.println("it is instance method of class ");
	 }
	 
	public static void main(String[] args) 
	{
		Day18_9 obj = new Day18_9();
		MyInterface ref = obj::m1;
		ref.display();
	}

}
