import java.util.ArrayList;

public class Day12_10 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(11);
		l1.add(22);
		l1.add(33);
		l1.add(44);
		l1.add(55);
		System.out.println("L1 = "+l1+" L1 hashcode "+l1.hashCode());

		ArrayList<Integer> l2 = l1; // reference copy // Shallow copy 
		System.out.println("L2 = "+l2+" L2 hashcode "+l2.hashCode());
		l1.add(66);
		System.out.println("L1 = "+l1);
		System.out.println("L2 = "+l2);
		
		l2.add(77);
		
		System.out.println("L1 = "+l1);
		System.out.println("L2 = "+l2);
	}


}
