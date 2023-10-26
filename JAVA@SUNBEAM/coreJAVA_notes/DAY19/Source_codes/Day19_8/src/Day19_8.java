import java.util.Arrays;
import java.util.List;

public class Day19_8 {

	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(11,22,33,44,55,66,77,88,99,100);
		
		System.out.println(numbers.stream()
		.filter(n -> n%2 ==0)
		.mapToInt(n -> n*2)
		.sum());

	}

}
