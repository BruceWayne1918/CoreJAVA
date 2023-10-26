import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
// printing the vector elements in different ways
// toString()
// Iterator
// ListIterator
// Enumeration

public class Day13_7 {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>();
		vec.addElement(25);
		vec.addElement(35);
		vec.addElement(45);
		vec.addElement(55);
		vec.addElement(65);
		vec.addElement(75);
		System.out.println("Vector elements = "+vec);
		
		//Iterator<Integer> itr = vec.iterator();
		//while(itr.hasNext())
			//System.out.print(itr.next()+"\t");
		
		
		
		//ListIterator<Integer> ltr = vec.listIterator();
		//System.out.println("Vector elements in forward direction");
		//while(ltr.hasNext())
			//System.out.print(ltr.next()+"\t");
		//System.out.println();
		//System.out.println("Vector elements in reverse direction");
		//while(ltr.hasPrevious())
			//System.out.print(ltr.previous()+"\t");
		
		
		//ListIterator<Integer> ltr = vec.listIterator(3);
		//System.out.println("Vector elements in forward direction");
		//while(ltr.hasNext())
			//System.out.print(ltr.next()+"\t");
		//System.out.println();
		//System.out.println("Vector elements in reverse direction");
		//while(ltr.hasPrevious())
			//System.out.print(ltr.previous()+"\t");
		
		
		Enumeration<Integer> e = vec.elements();
		while(e.hasMoreElements())
			System.out.print(e.nextElement()+"\t");
		
	}

}
