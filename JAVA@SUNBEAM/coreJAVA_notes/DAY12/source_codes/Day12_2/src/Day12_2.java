import java.util.ArrayList;
import java.util.Iterator;

// Displaying the AL elements 

public class Day12_2 {

	public static void main(String[] args) 
	{
		int data[]= {10,20,30,40,50,60};
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for(int i : data)
			l1.add(i);
		
		System.out.println("Printing the AL contents using toString()");
		System.out.println("L1 = "+l1); // l1.toString()
		System.out.println("Printing the AL contents using for loop");
		for(int i=0;i<l1.size();i++)
			System.out.print(l1.get(i)+"\t"); 
		
		// whenever we use for each loop it is used for traversing
		//from start to end
		// it will traverse in forward direction
		System.out.println("\n Printing the AL contents using for each loop");
		for(int element : l1)
			System.out.print(element+"\t");
		
		System.out.println("\n Printing the AL contents using iterator");
		Iterator<Integer> itr = l1.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+"\t");
		
		
		
		
	}

}
