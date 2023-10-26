package com.sunbeam.q1;

import com.sunbeam.q1.shapes.*;

/*


Create an abstract class BoundedShape with ﬁelds x, y. 
Provide abstract method calcArea().
Inherit it into a Circle class with additional ﬁelds radius and override calcArea() method.
inherit BoundedShape into another abstract class Polygon with additional ﬁeld number of sides.
Inherit BoundedShape into
classes Triangle (ﬁelds: side1, side2, side3), Square (ﬁelds: side), and Rectangle (ﬁelds: length, breadth).
Override calcArea() method in them. 
 
 
*/

public class ShapeTester {

	public static void main(String[] args) {
		
		BoundedShape refArr[]=new BoundedShape[4];
		refArr[0]=new Circle(10);
		refArr[1]=new Rectangle(10,20);
		refArr[2]=new Triangle(10,20,40);
		refArr[3]=new Square(50);
		
		for(BoundedShape each:refArr)
		{
			Helper.calculate(each);
			
		}
		
	
		

	}
	
	

}


