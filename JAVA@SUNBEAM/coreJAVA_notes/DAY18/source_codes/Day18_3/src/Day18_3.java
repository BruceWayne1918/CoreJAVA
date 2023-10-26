// disp() is a default method inside the interface Shape
// can we override default methods?? YES
// disp() is called with the help of object of that implemented class

interface Shape
{
	float PI =3.14f;
	void area();
	default void disp()
	{
		System.out.println("PI = "+PI);
		System.out.println("inside disp of default method");
	}
	
}

class Rectangle implements Shape
{

	@Override
	public void area() 
	{
		int l = 20;
		int b = 5;
		System.out.println("Area of Rectangle = "+(l*b));
		
	}
	
	@Override
	public void disp()
	{
		System.out.println("Inside disp of Rectangle class");
	}
	
}
class Square implements Shape
{

	@Override
	public void area() 
	{
		int side = 5;
		System.out.println("Area of Sqaure = "+(side * side));
		
	}
	@Override
	public void disp()
	{
		System.out.println("Inside disp of Square class");
	}
}

public class Day18_3 {

	public static void main(String[] args)
	{
		Rectangle robj = new Rectangle();
		Square sobj = new Square();
		robj.area();
		sobj.area();
		robj.disp();
		sobj.disp();
		

	}

}
