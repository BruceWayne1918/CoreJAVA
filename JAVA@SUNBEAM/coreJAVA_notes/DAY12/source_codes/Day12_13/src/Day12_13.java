import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Day12_13 {

	public static void main(String[] args)
	{
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Sunbeam");
		l1.add("Infotech");
		l1.add("CoreJava");
		l1.add("Python");
		System.out.println("L1 = "+l1);
		
		//for(int i =0 ;i<l1.size();i++)
			//System.out.println(l1.get(i));
		
		//for(String ele:l1)
			//System.out.println(ele);
		
		//Iterator<String> itr = l1.iterator();
		//while(itr.hasNext())
			//System.out.println(itr.next());
		
		
		ListIterator<String> ltr = l1.listIterator();
		System.out.println("LL in Forward Direction : ");
		while(ltr.hasNext())
			System.out.print(ltr.next() +"\t");
		
		System.out.println("\n LL in Reverse Direction :");
		while(ltr.hasPrevious())
			System.out.print(ltr.previous()+"\t");
		
		
		
	}
}
