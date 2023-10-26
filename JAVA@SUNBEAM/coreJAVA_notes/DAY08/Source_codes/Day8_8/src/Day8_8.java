// if we wish to call overridden method from sub class
// call by using super keyword
// super.methodname() 


class Product
{
	int pid;
	Product()
	{
		super();
	}
	Product(int id)
	{
		this.pid=id;
	}
	void disp()
	{
		System.out.println("PID = "+this.pid);
	}
	
}


class Laptop extends Product
{
	String name;
	Laptop()
	{
		super();
	}
	Laptop(String name)
	{
		this.name=name;
	}
	void disp() // overridden method 
	{
		//disp(); //not allowed // Recursive call // StackOverflowException 
		// this.disp(); //not allowed // Recursive call // StackOverflowException 
		super.disp();
		System.out.println("Name = "+this.name);
	}
}




public class Day8_8 {

	public static void main(String[] args) {
		 Laptop lobj = new Laptop();
		 lobj.disp();

	}

}
