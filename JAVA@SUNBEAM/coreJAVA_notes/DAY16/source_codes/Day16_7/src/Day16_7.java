

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


// read and write single byte from file (text file)
// FileReader
// FileWriter


public class Day16_7 {

	static Scanner sc = new Scanner(System.in);
	static final String pathName="Demo.txt";
	
	
	public static void writeRecord() throws IOException 
	{
		try(FileWriter fw = new FileWriter(new File(pathName));)
		{
			fw.write(123);
		}
	}
	
	public static void readRecord() throws IOException
	{
		try(FileReader fr = new FileReader(new File(pathName));)
		{
			System.out.println("Data is read from the file "+fr.read());
			
		}
	}
	
	static int menuList()
	{
		int choice;
		System.out.println("Please enter choice 0.Exit 1.Write 2.Read");
		choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) throws IOException 
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
