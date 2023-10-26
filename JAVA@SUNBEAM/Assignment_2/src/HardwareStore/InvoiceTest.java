package HardwareStore;

import java.util.Scanner;

public class InvoiceTest {
	
	
	public static void acceptData(Invoice ref)
	{
		System.out.println("Enter Part No. : ");
		ref.setPartNo((new Scanner(System.in)).nextLine());
		
		System.out.println("Enter Part Description : ");
		ref.setPartDesc((new Scanner(System.in)).nextLine());
		
		System.out.println("Enter Quantity : ");
		ref.setQty((new Scanner(System.in)).nextInt());
		
		System.out.println("Enter Price per unit qty : ");
		ref.setPrice((new Scanner(System.in)).nextDouble());
		
		System.out.println("");
	}

	public static void main(String[] args) {
		
		Invoice reductionGear=new Invoice();
		
		acceptData(reductionGear);
		reductionGear.dispInvoice();
		
		

	}

}
