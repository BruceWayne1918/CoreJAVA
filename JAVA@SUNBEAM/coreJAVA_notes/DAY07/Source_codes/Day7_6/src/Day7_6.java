

public class Day7_6 {

	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer("Sunbeam");
		StringBuffer sb2 = new StringBuffer("Sunbeam");
		StringBuffer sb3 = sb1;
		System.out.println("Sb1 == Sb2 "+(sb1==sb2)); // False
		System.out.println("Sb1 == Sb3 "+(sb1==sb3));  // True 
		// == will check reference equality ==> False
		
		System.out.println("Sb1 equals sb2 "+(sb1.equals(sb2))); // False 
		System.out.println("Sb1 equals sb3 "+(sb1.equals(sb3))); // True
		// equals() method is called upon sb1
		// sb1 ==> belongs to  ==> StringBuffer
		// compiler will search equals() in StringBuffer  class
		// equals() is not present in StringBuffer class
		// so it will go to its super class that is Object
		// here equals() will be called from Object class
		// it first checks the reference equality (==)
		// sb1 == sb2 ==> false 
		//The equals method for class Object implements  possible equivalence relation 
		//on objects; that is, for any non-null reference values x and y, this method returns 
		//true if and only if x and y refer to the same object (x == y has the value true).
	
		
		
		
		
		
	}
}


/*
//StringBuffer
//A thread-safe, mutable sequence of characters
//String buffers are safe for use by multiple threads
// append() and insert() methods 

public class Day7_6 {

	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer("Sunbeam");
		System.out.println("SB1 = "+sb1);
		sb1.append("Infotech");
		System.out.println("SB1 = "+sb1); // Mutable 
		sb1.insert(0, "CDAC-");
		System.out.println("SB1 = "+sb1); 
		
	}

}
*/