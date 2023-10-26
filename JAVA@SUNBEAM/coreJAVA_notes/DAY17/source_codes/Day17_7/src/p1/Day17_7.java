package p1;

import java.lang.annotation.Annotation;

public class Day17_7 {

	public static void main(String[] args)
	{
		Class c = Book.class;
		Annotation arr[] = c.getDeclaredAnnotations();
		for(Annotation a : arr)
		{
			if(a instanceof Author)
			{
				Author author = (Author) a;
				System.out.println("First name = "+author.firstName());
				System.out.println("Last Name = "+author.lastName());
				
			}
			
		}
	}

}
