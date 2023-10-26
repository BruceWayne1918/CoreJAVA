import java.util.Scanner;

//accepting the size of an array from user and then
//accepting array elements from user and display

public class Day5_10 {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter number of elements for an array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		
		
		System.out.println("Enter Array elements : ");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("Array Elements are : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
	}
}



/*
// accepting array elements from user and display

public class Day5_10 {

	public static void main(String[] args)
	{
		int arr[] = new int[5];
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Array elements : ");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("Array Elements are : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
	}
}
*/




/*
//valid and invalid declarations in an array

public class Day5_10 {

	public static void main(String[] args)
	{
		int a1[]=null; //valid
		int []a2=null; //valid
		int a3[]=new int[5]; //valid
		int []a4 =new int[4]; //valid
		// int [a5]=null; // invalid 
		//int a6[] = new int[-6];// compile time error wont come
		// it will throw runtime exception
		// NegativeArraySizeException
		
		int a7[]=new int[3];
		//System.out.println(a7[5]);
		// if we try to access the array element
		// beyond its limit it will throw one exception
		// ArrayIndexOutOfBoundsException
		
		int a8[]= {11,22,33,44,55}; //valid
		int []a9= {9,8,3,5,6} ; //valid
		//int a10[4]= {1,2,3,4}; // Not valid // javac error
		
	}
}

*/




/*
// creating 1D array and displaying the data of an array

public class Day5_10 {

	public static void main(String[] args)
	{
		int a1[]=new int[3]; // a1 is array 
		a1[0]=10;
		a1[1]=20;
		a1[2]=30;
		
		for(int i=0;i<a1.length;i++)
			System.out.print(a1[i]+"\t");
	}

}
*/