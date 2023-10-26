

public class Day21_1 {

	public static void main(String[] args) 
	{
		System.out.println("Normal = "+Thread.NORM_PRIORITY);
		System.out.println("Max = "+Thread.MAX_PRIORITY);
		System.out.println("Min = "+Thread.MIN_PRIORITY);
		Thread th = Thread.currentThread();
		System.out.println("Current Thread Priority = "+th.getPriority());
		th.setPriority(2);
		System.out.println("Current Thread Priority = "+th.getPriority());
		
		
		
	}
}



/*
public class Day21_1 {

	public static void main(String[] args) 
	{
		Thread th = Thread.currentThread();
		System.out.println("Name = "+th.getName());
		System.out.println("ID  = "+th.getId());
		System.out.println("Thread Group = "+th.getThreadGroup());
		System.out.println("Class = "+th.getClass());
		System.out.println("State = "+th.getState().name());
		System.out.println("Deamon thread = "+th.isDaemon());
		System.out.println("Active thread = "+th.isAlive());
		System.out.println("Priority = "+th.getPriority());
		
		
	}
}


*/



/*
public class Day21_1 {

	public static void main(String[] args) 
	{
		Thread th = Thread.currentThread();
		//System.out.println(th);
		//thread's name, priority, and thread group
		// main , 5 , main
		System.out.println(th.toString());
		
	}

}

*/
