import java.util.function.BiFunction;

// Method reference to a static method of a class

class Multiplication
{
	public static int multiply(int a,int b)
	{
		return a * b;
	}
}

public class Day19_1 {

	public static void main(String[] args) 
	{
		BiFunction<Integer,Integer,Integer> ref = Multiplication::multiply;
		int result = ref.apply(9,4);
		System.out.println("Result = "+result);
	}

}




