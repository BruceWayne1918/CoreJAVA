// if we wish to call non overridden method from sub class
// option1 : we just call the method by its name inside the sub class method
// option 2 : we can call super class method by using super.methodname()
// option 3: we can call super class method by using this.methodname()


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
	void dispDetails() // non overridden method 
	{
		//disp();
		// super.disp();
		this.disp(); // VALID 
		System.out.println("Name = "+this.name);
	}
}




public class Day8_7 {

	public static void main(String[] args) {
		 Laptop lobj = new Laptop();
		 lobj.dispDetails();

	}

}
