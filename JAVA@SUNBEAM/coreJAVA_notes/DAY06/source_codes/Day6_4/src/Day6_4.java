import java.util.Scanner;
// if we declare any array as null
// and if we  give a call to function on null array
// so it will throw NPE (NullPointerException)

// NPE 
//Taking the length of null as if it were an array.
//Accessing or modifying the slots of null as if it were an array.

public class Day6_4 {

	
	static void accept(int arr[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array elements : ");
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
	}
	
	
	static void disp(int arr[])
	{
		System.out.println("Array elements are : ");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	public static void main(String[] args) 
	{
		int a[]=null;
		accept(a);
		disp(a);
		
	}

}
