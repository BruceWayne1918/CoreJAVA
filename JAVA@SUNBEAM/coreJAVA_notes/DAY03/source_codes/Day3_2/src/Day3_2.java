
//Narrowing / Forced Conversion



public class Day3_2 {

	public static void main(String[] args) 
	{
		double d = 35.56; // d==> p type ==> double 
		int num = (int)d; //num ==> p ==> int
		// double to int  ==> p to p conversion ==> large to small ==> NARROWING 
		
		// IN CASE OF NARROWING MENTIONIN OF EXPLICIT CONVERSION IS COMPULSORY
		System.out.println("D = "+d+ " Num = "+num);
	}
}





/*
//widening
public class Day3_2 {

	public static void main(String[] args) 
	{
		int num = 60; // num ==> p type ==> int
		double d1 = num; 
		// num is automatically getting stored in double (IMPLICIT CONVERSION)
		// d1 ==> p type ==> double
		// int to double // p to p conversion
		//small to large // WIDENING
		
		// if you wish to explicitely do the type casting
		// In case of widening mentioning the data type is optional
		// Explicit type casting is optional 
		double d2 = (double)num; 
		System.out.println("Num  = "+num+ " D1 = "+d1+" D2 = "+d2);
		
	}
}

*/



/*
public class Day3_2 {

	public static void main(String[] args) {
		int num = 25; // num ==> p type ==> int 
		float fval = num;  // fval ==> p type ==> float
		// int to float conversion
		// type casting / conversion
		// p to p conversion 
		System.out.println("Num = "+num);
		System.out.println("FVAL = "+fval);
		

	}

}

*/