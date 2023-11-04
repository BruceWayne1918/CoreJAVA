package q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxString {

	public static void main(String[] args) {
		
  List<String>list=new ArrayList<>();
  
  
  
  list.add("Vaishnavi <3");
  list.add("Raj");
  list.add("Deep");
  list.add("Sutar");
  
  String maxString = Collections.max(list);
  System.out.println(maxString);

	}

}
