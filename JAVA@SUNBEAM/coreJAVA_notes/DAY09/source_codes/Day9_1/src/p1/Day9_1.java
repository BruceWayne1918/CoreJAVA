package p1;
// we do not create object of type interface
//we can create a reference of type interface
//we can also create an array of reference of interface type


// if the instance belongs to FilePrinter then only call the print()

public class Day9_1 {

	public static void main(String[] args) 
	{
		Printer p[] = {new ConsolePrinter(), new NetworkPrinter(),new FilePrinter()};
		// p[0] = ConsolePrinter
		// p[1] = NetworkPrinter 
		// p[2] = FilePrinter
		
		for(Printer pr : p)
		{
			if(pr instanceof FilePrinter)
				((FilePrinter)pr).print("15 pages");
		}
	}
}

/*

//instanceof operator

public class Day9_1 {

	public static void main(String[] args) 
	{
		Printer p = new NetworkPrinter();
		if(p instanceof NetworkPrinter)
			System.out.println("it is referring to network printer object");
		else
			System.out.println("it is not referring to network printer object");
	}
}

*/


/*
public class Day9_1 {

	public static void main(String[] args) 
	{
		Printer p; // p is reference of interface type
		p = new NetworkPrinter();
		p.print(" 10 pages printed");
		
		p = new ConsolePrinter();
		p.print(" printing on console...");
		
		p = new FilePrinter();
		p.print("documented is printed ");
	}

}
*/