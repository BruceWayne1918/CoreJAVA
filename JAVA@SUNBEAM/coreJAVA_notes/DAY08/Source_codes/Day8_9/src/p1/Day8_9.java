package p1;

//can we create array of references of abstract type? YES 


public class Day8_9 
{

	public static void main(String[] args) 
	{
		BoundedShape bs[]= {new Circle(80,70,5),new Rectangle(25,15,6,4)};
		 // bs is array of references of abstract class type
		// bs[0] = new Circle(80,70,5)
		//bs[1]  =new Rectangle(25,15,6,4)
		
		//display area of all the shapes
		
		for(BoundedShape s : bs)
			System.out.println(s.toString() + "Area = "+s.area());
		
	}
}


/*
// we can not create object of abstract class (javac error)
// but we can create reference of abstract class?? YES we can createe 

public class Day8_9 
{

	public static void main(String[] args) 
	{
		BoundedShape bs = new Circle(30,20,9);
		// bs is single reference of type BoundedShape 
		
		// bs is holidng a object of Circle class
		System.out.println(bs);
		System.out.println("Area of Circle= "+bs.area());
		
		bs = new Rectangle(13,12,9,8);
		// bs is holding object of Rectangle class
		System.out.println(bs);
		System.out.println("Area of Rectangle = "+bs.area());
		
	}
}

*/


/*
public class Day8_9 
{

	public static void main(String[] args) 
	{
		Circle cobj = new Circle(50,40,8);
		System.out.println(cobj);
		System.out.println("Area of Circle = "+cobj.area());
		Rectangle rec = new Rectangle(20,10,5,4);
		System.out.println(rec);
		System.out.println("Area of Rectangle = "+rec.area());
		

	}

}
*/