class Outer
{
	Outer()
	{
		System.out.println("Outer class constructor");
	}
	class Inner
	{
		Inner()
		{
			System.out.println("Inner class Constructor");
		}
	}
}
public class Day9_5 {

	public static void main(String[] args) {
		//creating object/ instance of Outer class
		//Outer out = new Outer();
		
		//creating object/ instance of inner class
		
		//Outer.Inner in = out.new Inner(); 

		Outer.Inner in = new Outer().new Inner();
	}

}
