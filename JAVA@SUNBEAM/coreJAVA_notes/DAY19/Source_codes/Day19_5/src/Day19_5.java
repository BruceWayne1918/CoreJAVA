// Method Reference to a Constructor
// if we have two constructors in a class 
//and if we wish to perform MethodReference to constructor
//then we must have separate functional interfaces for mapping with constructor  

@FunctionalInterface
interface MyInterface1
{
	Demo display(String s);
}

@FunctionalInterface
interface MyInterface2
{
	Demo display(int n1,int n2);
}
class Demo
{
	String str;
	int num1,num2;
	public Demo(String str)
	{
		System.out.println(str);
	}
	
	public Demo(int num1,int num2)
	{
		System.out.println("Num1 = "+num1+" Num2 = "+num2);
	}
	
}


public class Day19_5 
{

	public static void main(String[] args)
	{
		MyInterface1 ref1 = Demo :: new;
		ref1.display("Hello Everyone!!");
		
		
		MyInterface2 ref2 = Demo :: new;
		ref2.display(50,20);
		

	}

}
