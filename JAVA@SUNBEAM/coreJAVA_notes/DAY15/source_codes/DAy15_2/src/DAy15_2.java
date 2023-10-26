import java.io.File;
import java.io.IOException;

// creating and deleting a directory(folder)
public class DAy15_2 {

	public static void main(String[] args) 
	{
			String pathname = "java";
			File fobj=new File(pathname);
			boolean status = fobj.mkdir();
			System.out.println("Status = "+status);
			status = fobj.delete();
			System.out.println("File deleted = "+status);
			
		
		

	}

}






//creating and deleting a file
/*
public class DAy15_2 {

	public static void main(String[] args) 
	{
		try
		{
			String pathname = "Test.txt";
			File fobj=new File(pathname);
			boolean status = fobj.createNewFile();
			System.out.println("Status = "+status);
			status = fobj.delete();
			System.out.println("File deleted = "+status);
			
		}
		catch(IOException e)
		{
			System.out.println("Exception occured");
		}

	}

}


*/