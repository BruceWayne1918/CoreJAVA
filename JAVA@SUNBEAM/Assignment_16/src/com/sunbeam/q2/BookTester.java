package com.sunbeam.q2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.*;


import com.sunbeam.q2.comparator.ComparatorIsbn;
import com.sunbeam.q2.comparator.ComparatorPrice;


public class BookTester {

	static FileOutputStream generateFOS() {
		FileOutputStream fos = null;
		try {
			fos= new FileOutputStream("book.db");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			e.printStackTrace();
		}
		
		return fos;
	}
	
	static FileInputStream generateFIS() {
		FileInputStream fis = null;
		try {
			fis= new FileInputStream("book.db");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			e.printStackTrace();
		}
		return fis;
	}

	public static void main(String args[]) 

	{


		Scanner sc = new Scanner(System.in);

		List<Book>collection=new  ArrayList<Book>();

		Comparator<Book>cmp=null;



		while(true) 
		{
			switch(Menu.myMenu()) 
			{

			case EXIT : //0
				break;

			case ADD_BOOK ://1
				int flag =1;

				//			sc.nextLine();
				System.out.println("Enter book ISBN : ");
				String isbn= sc.next();

				System.out.println("Enter Book Quantity : ");
				String quantity=sc.next();


				if(!collection.isEmpty()) {


					for(Book each:collection)
					{
						if(each.getIsbn().equals(isbn))
						{
							each.setQuantity(each.getQuantity()+ Integer.parseInt(quantity)); 
							flag=0;
							break;

						}
					}

					if(flag==1) 
					{
						System.out.println("Enter Book Auther Name : ");
						String autherName=sc.next();

						System.out.println("Enter book Price : ");
						double price=sc.nextDouble();
						collection.add(new Book( isbn, autherName,  price,  Integer.parseInt(quantity)));
					}


				}

				else{
					System.out.println("Enter Book Auther Name : ");
					String autherName=sc.next();

					System.out.println("Enter book Price : ");
					double price=sc.nextDouble();
					collection.add(new Book( isbn, autherName,  price,  Integer.parseInt(quantity)));
				}
				break;


			case DISPLAY :
				Iterator<Book>itr= collection.iterator();
				int index=0;
				while(itr.hasNext())
				{	index++;
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("BOOK : "+index);
				Book n=itr.next();
				System.out.println(n);
				}

				//			for(Book each:collection)
				//			{
				//				System.out.println(each.toString(collection.indexOf(each)));
				//			}
				break;

			case SEARCH_BOOK ://3
				
				System.out.println("Enter the ISBN : ");
				String str= sc.next();
				int i=0;
				Book targetBook=new Book(str,"",0.0,0);
				i=collection.indexOf(targetBook);

				if (i!= -1)
				{
					System.out.println("BOOK FOUND AT INDEX : "+i);
				} 

				else
				{
					System.out.println("BOOK NOT FOUND !");
				}

				break;


			case DELETE_BOOK_ISBN ://4

				System.out.println("Enter the ISBN : ");
				str= sc.next();
				i=0;
				targetBook=new Book(str,"",0.0,0);
				i=collection.indexOf(targetBook);

				if (i!= -1)
				{
					collection.remove(i);
					System.out.println("BOOK DELETED!");
				} 

				else
				{
					System.out.println("UNABLE TO DELETE,ENTERED ISBN NOT FOUND !");
				}
				break;

			case DELETE_BOOK_INDEX ://5

				System.out.println("----------------------------------------------------------------------------------------");
				for(Book each:collection)
				{	
					System.out.println("INDEX : "+collection.indexOf(each)+" : "+"ISBN : "+each.getIsbn()+" |  Auther Name :  "+each.getAutherName());
				}



				System.out.println("Enter the INDEX : ");
				str= sc.next();

				if (Integer.parseInt(str)>-1 && Integer.parseInt(str)<collection.size())
				{
					collection.remove(Integer.parseInt(str));
					System.out.println("BOOK DELETED!");
				} 

				else
				{
					System.out.println("UNABLE TO DELETE,ENTERED INDEX IS OUT OF RANGE !");
				}
				break;

			case DELETE_BOOK_NAME ://6

				System.out.println("Enter the Auther name : ");
				str= sc.next();
				i=0;
				targetBook=new Book("",str,0.0,0);

				i=collection.indexOf(targetBook);

				if (i!= -1)
				{
					collection.remove(i);
					System.out.println("BOOK DELETED!");
				} 

				else
				{
					System.out.println("UNABLE TO DELETE,ENTERED AUTHOR NOT FOUND !");
				}
				break;

			case SORTBY_ISBN ://7
				cmp=new ComparatorIsbn();
				Collections.sort(collection,cmp );
				System.out.println("Sroted by isbn in ascending order");
				break;

			case SORTBY_PRICE_DESC ://8
				cmp=new ComparatorPrice();
				Collections.sort(collection, cmp);
				System.out.println("Sroted by price in descending order");
				break;
				
			case REVERSE ://9
				Collections.reverse(collection);
				System.out.println("List Reversed!");
				break;
				
			case SAVE_IN_FILE ://9
				FileOutputStream fos =generateFOS();
				
				try(DataOutputStream dout = new DataOutputStream(fos)){
					
					for(Book each:collection)
					{
						dout.writeUTF(each.getIsbn());
						dout.writeUTF(each.getAutherName());
						dout.writeDouble(each.getPrice());
						dout.writeInt(each.getQuantity());
					}
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				System.out.println("Books Saved In file!");
				break;
				
			case LOAD_FROM_FILE ://9
				FileInputStream dis =generateFIS();
				
				try(DataInputStream din = new DataInputStream(dis)){
					
					while(true) {
					Book b=new Book();
					
					b.setIsbn(din.readUTF());
					b.setAutherName(din.readUTF());
					b.setPrice(din.readDouble());
					b.setQuantity(din.readInt());
					System.out.println("------------------------------------------------------------------------------------------");
					System.out.println(b);
					}
					
				}
				catch (EOFException err) {

					
				}
				catch (IOException e) {
					
					e.printStackTrace();
				}
				
				
				break;

/*1. In menu-driven program of Books (with ArrayList - Day12 Q1) add two more menus. Save books in ﬁle and load books from ﬁle. Use DataOutputStream
and DataInputStream.*/


			}
		}

	}

	@Override
	public String toString() {
		return "BookTester []";
	}
}
