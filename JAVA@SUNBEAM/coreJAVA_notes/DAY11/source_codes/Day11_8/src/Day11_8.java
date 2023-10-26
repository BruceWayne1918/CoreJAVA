
//throws keyword is used in front of method name
// throws keyword is generally used for delegation of exception
// sleep() method is called from main() method
// if sleep() is throwing IE exception , so caller of the sleep()
// must handle it

public class Day11_8 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Core java Day11");
		Thread.sleep(3000);
		System.out.println("topic: exception handling");
	}

}
