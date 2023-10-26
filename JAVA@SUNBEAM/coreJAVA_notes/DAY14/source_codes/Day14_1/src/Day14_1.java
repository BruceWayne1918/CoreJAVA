import java.util.HashSet;

// Set Hierarchy

// example of HashSet , TreeSet  and LinkedHashSet 


 //HashSet : Unordered  , Unsorted , no duplicates , allows null only once 
// this implementation is not synchronized. 
// unordered means it does not guarantee the insertion order of elements 
public class Day14_1 {

	public static void main(String[] args) 
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(213);
		hs.add(345);
		hs.add(123);
		hs.add(789);
		hs.add(123);
		hs.add(null);
		hs.add(null);
		
		//System.out.println("Elements in Hashset "+hs);
		System.out.println("Elements inside Hash Set are : ");
		for(Integer i : hs)
			System.out.print(i +"\t");
		
	}

}
