package p2;

//import p1.Faculty;// fully qualified name 
//import p1.Student; // fully qualified name 

import p1.*; // import all the classes from package p1 

public class Day5_3 {

	public static void main(String[] args) 
	{
		Student s1 = new Student(25,85);
		Faculty f1 = new Faculty(123,"emp1");
		s1.disp();
		f1.printInfo();
		System.out.println("S1 = "+s1);
		//when we print s1 , it will implicitly call method toString()
		// if Student class has toString() then it will be called
		// else toString() will be called from Object class 
		System.out.println("F1 = "+f1);
	

	}

}
