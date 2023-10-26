import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//FAIL-SAFE ITERATOR 
// if we use enumeration, it allows concurrent modification

public class Day13_8 {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>();
		vec.addElement(25);
		vec.addElement(35);
		vec.addElement(45);
		vec.addElement(55);
		vec.addElement(65);
		vec.addElement(75);
		System.out.println("Vector elements = "+vec);
		
		Enumeration<Integer> e = vec.elements();
		while(e.hasMoreElements())
		{
			int element = e.nextElement();
			System.out.println("Element = "+element);
			if(element == 45)
				vec.addElement(99);
		}
		System.out.println("Vec Elements = "+vec);

	}

}





/*
// if we use iterator() or listIterator() 
// and while traversing through the collection
// if we make changes to the collection at that moment
// it throws one exception, ConcurrentModificationException
// FAIL-FAST ITERATOR

public class Day13_8 {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>();
		vec.addElement(25);
		vec.addElement(35);
		vec.addElement(45);
		vec.addElement(55);
		vec.addElement(65);
		vec.addElement(75);
		System.out.println("Vector elements = "+vec);
		
		Iterator<Integer> itr = vec.iterator();
		while(itr.hasNext())
		{
			int element = itr.next();
			System.out.println("Element = "+element);
			if(element == 45)
				vec.addElement(99);//ConcurrentModificationException
		}
		System.out.println("Vec Elements = "+vec);

	}

}


*/