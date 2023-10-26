

public class Q5 {
    public static void main(String[] args) {
        int rows = 5; 

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            
            System.out.println();
        }
        
        int rows1 = 5; 

        for (int i = 1; i <= rows1; i++) {
            
        	for (int k = 1; k <= i; k++)
        	{
                System.out.print(" ");
            }

            
             for (int j = 1; j <= rows1 - i; j++) {
                System.out.print("* ");
            }

            
            System.out.println();
        }
    }
}






/*
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

*/