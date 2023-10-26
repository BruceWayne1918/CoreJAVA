import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// create one class ReflectionDemo
// declare one field
// declare some constructor (parameterless)
// declare some methods (public-m1, public - m2 , private - m3 etc )

// reflect the class ReflectionDemo
// fetch the information about the class


class ReflectionDemo
{
	private String str;
	
	public ReflectionDemo()
	{
		//System.out.println("Inside Parameterless constructor");
	}
	
	public ReflectionDemo(String str)
	{
		//System.out.println("Inside Paramatrized constructor");
		this.str=str;
	}
	
	public void m1()
	{
		System.out.println("Inside Method1 Str = "+str);
	}
	
	public void m2(int num1)
	{
		System.out.println("Inside Method2 = "+num1);
		
	}
	
	private void m3()
	{
		System.out.println("Inside Method3");
	}
}

/*
//this program is fetching the constructors in the class ReflectionDemo
public class Day17_6 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException
	{
		ReflectionDemo robj = new ReflectionDemo();
		Class c = robj.getClass(); // reflected the class
		
		Constructor carr[]= c.getDeclaredConstructors();
		
		for(Constructor ctr : carr)
			System.out.println(ctr.getName());
		
		System.out.println();
		
		Constructor carr1[] = c.getConstructors();
		for(Constructor ctr : carr1)
			System.out.println(ctr.getName());
		
		System.out.println();
		Constructor cons = c.getConstructor();
		System.out.println("Cons = "+cons);
		
		System.out.println();
		Constructor cons1 = c.getConstructor(String.class);
		System.out.println("Cons1 = "+cons1);
		
		
	}

}

*/

//this program is fetching the methods in the class ReflectionDemo

//getDeclaredMethods() returns methods declared inside that class

// getMethods() 
//Returns an array containing Method objects reflecting 
//all the public methods of the class or interface represented 
//by this Class object, including those declared by the class or 
//interface and those inherited from superclasses and superinterfaces.



public class Day17_6 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		ReflectionDemo robj = new ReflectionDemo();
		Class c = robj.getClass(); // reflected the class
		
		Method marr[] = c.getDeclaredMethods();
		
		for(Method m : marr)
			System.out.println("Name = "+m+" Parameter Count = "+m.getParameterCount());
			
		System.out.println("Fetching method information using getMethods()");
		Method marr1[]= c.getMethods();
		for(Method m : marr1)
			System.out.println("Name = "+m+" Parameter Count = "+m.getParameterCount());

		System.out.println();
		Method m = c.getDeclaredMethod("m1", null);
		m.invoke(robj);
		
		System.out.println();
		Method mtd = c.getDeclaredMethod("m2", int.class);
		mtd.invoke(robj,50);
		
		System.out.println();
		Method mtd3 = c.getDeclaredMethod("m3", null); 
		//mtd3.invoke(robj);//IllegalAccessException // m3 is declared as private
		mtd3.setAccessible(true);
		mtd3.invoke(robj);
	}
}




/*
public class Day17_6 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException
	{
		ReflectionDemo robj = new ReflectionDemo();
		Class c = robj.getClass(); // reflected the class
		
		Field farr[]=c.getDeclaredFields();
		for(Field f : farr)
			System.out.println(f.getName());
		
		Field  f = c.getDeclaredField("str");
		System.out.println(f.getName());
		//f.set(robj,"Sunbeam"); // IllegalAccessException // str is private
		f.setAccessible(true);
		f.set(robj, "Sunbeam");
		robj.m1();
		
		
	}
}
*/






