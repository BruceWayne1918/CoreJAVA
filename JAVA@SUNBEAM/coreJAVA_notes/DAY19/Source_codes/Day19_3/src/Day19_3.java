import java.util.Arrays;

// Method reference to an instance method of an arbitrary object of perticular type

public class Day19_3 {

	public static void main(String[] args) 
	{
		String []strArr = {"akshita","sunbeam","pune","trainer","java","technical"};
		Arrays.sort(strArr,String::compareTo);
		
		System.out.println("Printing sorted data using index");
		
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		
		System.out.println("Printing sorted data using for loop");
		for(String s : strArr)
			System.out.println(s);
		
		System.out.println("Printing sorted data using lambda expression");
		
		//Arrays.stream(strArr) this statement will convert
		// strArr in the set of elements as a collection
		
		Arrays.stream(strArr).forEach(x -> System.out.println(x));
		
		System.out.println("Printing sorted data using method reference");
		
		Arrays.stream(strArr).forEach(System.out::println);
	}

}
