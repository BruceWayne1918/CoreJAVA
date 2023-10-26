package p1;

public class FilePrinter implements Printer 
{

	@Override
	public void print(String msg) // overridden method
	{
		System.out.println("Inside file printer print method "+msg);
		// can we access data from Printer interface directly ?? YES
		System.out.println("Data = "+DATA);
	}
		
}
