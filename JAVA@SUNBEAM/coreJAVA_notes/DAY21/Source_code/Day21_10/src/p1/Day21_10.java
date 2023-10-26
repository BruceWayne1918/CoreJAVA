package p1;

public class Day21_10 {

	public static void main(String[] args) 
	{
		Account acc = new Account(123,"Saving",50000);
		final double amount = 1000.0;
		
		Thread dt = new Thread(() -> {
			for(int i=1;i<7;i++)
			{
				acc.deposit(amount);
				System.out.println("After Deposit = "+acc.getBalance());
				Util.delay(4000);
			}
		});
		dt.start();
		
		
		
		Thread wt = new Thread(() -> {
			for(int i=1;i<3;i++)
			{
				acc.withdraw(amount);
				System.out.println("After Withdraw = "+acc.getBalance());
				Util.delay(2000);
			}
		});
		wt.start();
		
		try
		{
			dt.join();
			wt.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Final Balance = "+acc.getBalance());
		
	} //end of main

} //end of class