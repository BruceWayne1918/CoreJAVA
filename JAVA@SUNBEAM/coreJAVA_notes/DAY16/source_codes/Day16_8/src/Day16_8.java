
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// read and write multiple bytes from file (text file)
// BufferedReader
// BufferedWriter

public class Day16_8 {

	static Scanner sc = new Scanner(System.in);
	static final String pathName="Demo.txt";
	
	
	public static void writeRecord() throws IOException
	{
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(pathName)));)
		{
			for(char ch='A';ch<='Z';ch++)
				bw.write(ch);
		}
	}
	
	public static void readRecord() throws IOException
	{
		try(BufferedReader br = new BufferedReader(new FileReader(new File(pathName)));)
		{
			int data;
			while((data = br.read())!=-1)
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
	
	public static void main(String[] args) throws  IOException 
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
