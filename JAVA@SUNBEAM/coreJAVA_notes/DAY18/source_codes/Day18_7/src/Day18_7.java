@FunctionalInterface
interface Sum
{
	int m1(int a,int b);
}

@FunctionalInterface
interface Sub
{
	int m2(int a,int b);
}


public class Day18_7 
{

	public static void main(String[] args) 
	{
		Sum sref1 = (x,y) -> {return x + y;};
		Sub sref2 = (x,y) -> { return x-y;};
		
		System.out.println(sref1.m1(50,20));
		System.out.println(sref2.m2(9,3));
		

	}

}
