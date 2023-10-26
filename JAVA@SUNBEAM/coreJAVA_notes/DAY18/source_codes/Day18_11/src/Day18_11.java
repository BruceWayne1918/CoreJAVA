
// Method reference to an instance method of an object


@FunctionalInterface
interface MyInterface
{
	void display();
}


class Mobile
{
	String name;
	int price;
	Mobile(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	
	void dispDetailsMobile() // instance method 
	{
		System.out.println("Name of Mobile = "+this.name+" Price = "+this.price);
	}
}

class Laptop
{
	String name;
	int ramsize;
	Laptop(String name,int ramsize)
	{
		this.name=name;
		this.ramsize=ramsize;
	}
	
	void dispDetailsLaptop() // instance method 
	{
		System.out.println("Name of Laptop = "+this.name+" RAM size = "+this.ramsize);
	}
	
	void show()
	{
		System.out.println("Inside show function of laptop");
	}
	
}




public class Day18_11
{

	 	 
	public static void main(String[] args) 
	{
		Mobile mobj = new Mobile("Apple",55000);
		Laptop lobj = new Laptop("Dell",90000);
		
		MyInterface ref = mobj::dispDetailsMobile;
		System.out.println("Ref = "+ref);
		ref.display();
		ref = lobj::dispDetailsLaptop;
		System.out.println("Ref = "+ref);
		ref.display();
		ref = lobj::show;
		System.out.println("Ref = "+ref);
		ref.display();
	}

}


