import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// read and write primtive types from file (binary file)
// DataInputStream
// DataOutputStream


public class Day16_2 {

	static Scanner sc = new Scanner(System.in);
	static final String pathName="Test.dat";
	
	
	public static void writeRecord() throws FileNotFoundException, IOException
	{
		try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(pathName))));)
		{
			dos.writeUTF("Akshita");
			dos.writeInt(36);
			dos.writeFloat((float) 95.5);
			
		}
	}
	
	public static void readRecord() throws IOException
	{
		try(DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(pathName))));)
		{
			String str = dis.readUTF();
			int age = dis.readInt();
			float marks = dis.readFloat();
			System.out.println("Name = "+str+" Age = "+age+" Marks = "+marks);
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
