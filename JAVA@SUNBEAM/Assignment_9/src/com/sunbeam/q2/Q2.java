package com.sunbeam.q2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2 {

public static void main(String[] args) {

String str = "Bank Of Maharashtra";
System.out.println("Enter bank name : ");
str=new Scanner(System.in).nextLine();

StringTokenizer tokens=new StringTokenizer(str," ");
System.out.println(str);

String[]substr=new String [tokens.countTokens()];
int i=0;
str="";

while(tokens.hasMoreTokens()) {
substr[i]=tokens.nextToken().substring(0,1).toUpperCase();
str+=substr[i];
i++;
}

//
System.out.println("-------------------------------------------------------");
System.out.println(str);
System.out.println("-------------------------------------------------------");

//*****************************************************************************************************************************************


System.out.println("Enter any sentence : ");
str=new Scanner(System.in).nextLine();

StringTokenizer tokens2=new StringTokenizer(str," ");
System.out.println(str);

String[]substr2=new String [tokens2.countTokens()];
i=0;
str="";
String res ="";


while(tokens2.hasMoreTokens()) {
	
	
	substr2[i]=tokens2.nextToken();
	
	
	

		s=0;
		
		
	
	
	

i++;}


System.out.println("-------------------------------------------------------");
System.out.println(str);
System.out.println("-------------------------------------------------------");


/*********************************************************************************************************************************************/

System.out.println("Enter any sentence : ");
str=new Scanner(System.in).nextLine();

StringTokenizer tok3=new StringTokenizer(str,"");
System.out.println(str);

String[]ex=new String[tok3.countTokens()];
i=0;

while(tok3.hasMoreTokens())
{
	

	if(i%2 == 0) {
		ex[i]=tok3.nextToken().toLowerCase();
		i++;
	}
	else
	{
		ex[i]=tok3.nextToken().toUpperCase();
		i++;
	}
		
	}


}

}


/*Write methods to perform following string conversions.
Bank Of Maharashtra --> BOM
this is string --> This Is String
Example --> eXaMpLe
www.sunbeaminfo.com --> www.sunbeaminfo.in*/