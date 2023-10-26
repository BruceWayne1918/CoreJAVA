package p1;

// If any class extends abstract class
// then the class must implement the unimplemented methods 
// eg. area() was declared abstract in BoundedShape class
//so if Circle class extends BoundedShape class then 
// we must write the implementation of area() inside Circle class 
// it is compulsory or else javac error

public class Circle extends BoundedShape
{
	private int radius;
	
	public Circle(int x,int y,int radius)
	{
		super(x,y);
		this.radius=radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]"+ super.toString();
	}

	@Override
	public double area() 
	{
		return Math.PI * radius * radius;
	}
	
	
	
	
	
	
}
