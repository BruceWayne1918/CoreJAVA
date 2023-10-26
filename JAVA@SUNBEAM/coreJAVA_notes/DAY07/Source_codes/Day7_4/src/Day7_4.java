
//String and its methods

public class Day7_4 {

	public static void main(String[] args)
	{
		String s1 = "Sunbeam";
		String s2 = "Sunbeam";
		String s3 = "sunbeam";
		char ch = s1.charAt(1);
		System.out.println("Character at 1st location = "+ch);
		System.out.println("Compare to = "+s1.compareTo(s2));
		System.out.println("Compare to = "+s2.compareTo(s3));
		//Compares two strings lexicographically.
		// S = 83   // s = 115  
		// 83 - 115 = -32 
		
		
		System.out.println("Compare to ignore case= "+s2.compareToIgnoreCase(s3));
		System.out.println("s1 contains SUN = "+s1.contains("Sun"));
		
		System.out.println("Index of letter 'm' = "+s1.indexOf('m'));
		System.out.println("Length of S1  =" +s1.length());
		System.out.println("Lower case = "+s1.toLowerCase());
		System.out.println("Upper  case = "+s1.toUpperCase());
	}
}


/*
public class Day7_4 {

	public static void main(String[] args)
	{
		String s1 = new String("Hello"); // NL 
		System.out.println("S1 = "+s1);
		System.out.println("S1 = "+(s1.concat("Everyone")));
		System.out.println("S1 = "+s1 ); //immutable
		s1 = s1.concat("Everyone");
		System.out.println("S1 = "+s1 ); 
	}

}
*/