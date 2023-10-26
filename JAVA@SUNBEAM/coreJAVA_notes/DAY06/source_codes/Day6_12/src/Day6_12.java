// enum ==> Enumeration
// improve the readability of the code 

// RED ==> 0
// GREEN ==> 1
// BLUE ==> 2

//whenever we create enum , its respective .class file gets created

enum Color
{
	RED,GREEN,BLUE;
	// RED ==>0  GREEN ==> 1 BLUE==> 2
	// internally these are treated as static fields of the enum 
	// Ordinal Values
	// position at which the constants are declared
	
}


public class Day6_12 {

	public static void main(String[] args)
	{
		Color clr = Color.RED;
		System.out.println(clr.ordinal()+"\t"+clr.name());
		
		clr=Color.GREEN;
		System.out.println(clr.ordinal()+"\t"+clr.name());
		
		clr = Color.BLUE;
		System.out.println(clr.ordinal()+"\t"+clr.name());
		
		
		
	}

}
