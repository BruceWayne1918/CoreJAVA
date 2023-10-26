import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// read and write multiple bytes from file (binary file)
// BufferedInputStream
// BufferedOutputStream


public class Day16_1 {

	static Scanner sc = new Scanner(System.in);
	static final String pathName="Test.dat";
	
	
	public static void writeRecord() throws FileNotFoundException, IOException
	{
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(pathName)));)
		{
			for(char ch='A';ch<='Z';ch++)
				bos.write(ch);
		}
	}
	
	public static void readRecord() throws IOException
	{
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(pathName)));)
		{
			int data;
			while((data = bis.read())!=-1)
			{
				System.out.print((char)data+"\t");
			}
		}
	}
	
	static int menuList()
	{
		int choice;
		System.out.println("Please enter choice 0.Exit 1.Write 2.Read");
		choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		int ch;
		while((ch = menuList())!=0)
		{
			switch(ch)
			{
			case 1:
				writeRecord();
			break;
			case 2:
				readRecord();
			break;
			}
		}
	}

}
