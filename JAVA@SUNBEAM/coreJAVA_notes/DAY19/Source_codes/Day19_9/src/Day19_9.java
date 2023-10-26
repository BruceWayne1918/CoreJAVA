import java.util.Arrays;
import java.util.List;

public class Day19_9 {

	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		int sum = list.stream().map(x -> x*x). reduce((x,y)->x+y).get();
		System.out.println("Sum = "+sum);
		
	}

}
