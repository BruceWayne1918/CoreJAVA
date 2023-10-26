package p1;
import java.util.Map;
import java.util.HashMap;

public class Day20_3
{

	public static void main(String[] args) 
	{
		Map<Integer,Student> map = new HashMap<>();
		
		Student s;
		s=new Student(20,"s5",85);
		map.put(s.getRoll(), s);
		
		s=new Student(10,"s2",70);
		map.put(s.getRoll(), s);
		
		s=new Student(30,"s3",90);
		map.put(s.getRoll(), s);
		
		
		s=new Student(50,"s4",88);
		map.put(s.getRoll(), s);
		
		
		s=new Student(60,"s1",78);
		map.put(s.getRoll(), s);
		
		System.out.println(map);
		
		System.out.println("Sort the stream of students based on name ");
		
		map.values().stream()
		.sorted((s1,s2) -> s1.getName().compareTo(s2.getName()))
		.forEach(System.out::println);
		System.out.println();
		System.out.println("Sort the stream of students based on marks");
		map.values().stream()
		.sorted((s1,s2)->Double.valueOf(s1.getMarks()).compareTo(s2.getMarks()))
		.forEach(System.out::println);

	}

}


