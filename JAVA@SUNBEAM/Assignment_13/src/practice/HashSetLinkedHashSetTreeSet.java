package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetLinkedHashSetTreeSet {

	public static void main(String[] args)
	{
		Set <String>set1=new HashSet<>();
//		
//		set1.add("Pune");		// returns true
//		set1.add("Satara");		// returns true
//		set1.add("Mumbai");		// returns true
//		set1.add("Nashik");		// returns true
//		set1.add("Sangli");		// returns true
//		set1.add("Mumbai");		// returns false
		
//		boolean b=set1.add("Sangli");
//		if(b==false)
//			System.out.println("false");
		
//		System.out.println("HashSet Size: " + set1.size());
//		for(String ele:set1)
//			System.out.println(ele);
//		System.out.println("");
//		for(String ele:set1)
//			System.out.println(ele);
		

		Set<String> set2 = new LinkedHashSet<String>();
		set2.add("Pune");
		set2.add("Satara");
		set2.add("Mumbai");
		set2.add("Nashik");
		set2.add("Sangli");
		set2.add("Mumbai");
		
		System.out.println("LinkedHashSet Size: " + set2.size());
		for(String ele:set2)
			System.out.println(ele);
//
//		Set<String> set3 = new TreeSet<String>();
//		set3.add("Pune");
//		set3.add("Satara");
//		set3.add("Mumbai");
//		set3.add("Nashik");
//		set3.add("Sangli");
//		set3.add("Mumbai");
//		
//		System.out.println("TreeSet Size: " + set3.size());
//		for(String ele:set3)
//			System.out.println(ele);
	}

}
