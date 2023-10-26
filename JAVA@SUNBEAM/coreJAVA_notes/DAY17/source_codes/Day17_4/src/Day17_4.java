// second way is to use method getClass() ==> defined in Object class

class Demo
{
	
}

public class Day17_4 {

	public static void main(String[] args) 
	{
		Demo d = new Demo();
		Class c = d.getClass();
		System.out.println(c.getName());
		
		Day17_4 dobj = new Day17_4();
		c = dobj.getClass();
		System.out.println(c.getName());
	}

}
