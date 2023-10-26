package p1;

public class Rectangle extends BoundedShape 
{
	double w,h;
	public Rectangle(int x,int y,double w,double h)
	{
		super(x,y);
		this.w=w;
		this.h=h;
	}
	@Override
	public String toString() {
		return "Rectangle [w=" + w + ", h=" + h + "]"+super.toString();
	}
	@Override
	public double area() 
	{
		return w * h;
	}
	
	
	
	
	
}
