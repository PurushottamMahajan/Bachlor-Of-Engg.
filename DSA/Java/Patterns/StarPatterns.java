package Patterns;
public class StarPatterns {
    
    public static void main(String[] args) {
        Pattern01(5);
        System.out.println();
        Pattern02(5);
        System.out.println();
        Pattern03(5);
        System.out.println();
        Pattern04(5);
        System.out.println();
        Pattern05(5);
        System.out.println();
        Pattern06(5);
        System.out.println();
        Pattern07(5);
        System.out.println();
        Pattern08(5);
        System.out.println();
        Pattern09(5);
        System.out.println();
        Pattern10(5);
        System.out.println();
        Pattern11(5);
        System.out.println();
        Pattern12(5);
        
        
    }
    //Pattern 1 
    //*
    //**
    //***
    //****
    //*****      
    static void Pattern02(int n)
    {
        for(int i=0;i<n;i++)
        {
            for (int j =0;j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    
    //Pattern 2
    // ******
    // *****
    // ****
    // ***
    // **
    // *
    static void Pattern03(int n)
    {
        for(int i=n;i>=0;i--)
        {
            for (int j =0;j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    //Pattern 3
    // *****   
    // *****
    // *****
    // *****
    // *****
    static void Pattern01(int n)
    {
        for(int i=0;i<n;i++)
        {
            for (int j =0;j<n;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    //Pattern 4
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    
    static void Pattern04(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColumns = row > n ? 2 * n - row: row;
            for (int col = 0; col < totalColumns; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //pattern 5
    //      *
    //     **
    //    ***
    //   ****
    //  *****
    static void Pattern05(int n) {
        for (int row = 1; row <= n; row++) {
            int totalColumns =  row;
            int spaces=n-totalColumns;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for (int col = 0; col < totalColumns; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Pattern 6
    // *****
    //  ****
    //   ***
    //    **
    //     *
    static void Pattern06(int n) {
        for (int row = n; row >= 0; row--) {
            int totalColumns =  row;
            int spaces=n-totalColumns;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for (int col = 0; col < totalColumns; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Pattern 07
    // 	       * 
    // 	  	 * * 
    //     * * * 
    //   * * * * 
    // * * * * * 
    //   * * * * 
    //     * * * 
    // 	     * * 
    // 	       *
	static void Pattern07(int n)
    {		
            for (int row = 0; row < 2 * n; row++) {
             int totalColsInRow = row > n ? 2 * n - row: row;
 
             int noOfSpaces = n - totalColsInRow;
             for (int s = 0; s < noOfSpaces; s++) {
                 System.out.print(" ");
             }
 
             for (int col = 0; col < totalColsInRow; col++) {
                 System.out.print("*");
             }
             System.out.println();
         }
    }
        
    //Patter 8
    //     *
    //    * *
    //   * * *
    //  * * * *
    // * * * * *
    static void Pattern08(int n) {
        for (int row = 1; row <= n; row++) {
            int totalColumns =  row;
            int spaces=n-totalColumns;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for (int col = 0; col < totalColumns; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //Pattern 9
    //  * * * * *
    //  * * * *
    //   * * *
    //    * *
    //     *

    static void Pattern09(int n)
    {
        for (int row = 0; row < n; row++) {
            int totalColumns =  n-row;

            int spaces=n-totalColumns;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }

            for (int col = 0; col < totalColumns; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
	//Pattern10
	//        * 
	//      * * * 
	//    * * * * * 
	//  * * * * * * * 
	//* * * * * * * * * 
	//  * * * * * * * 
	//    * * * * * 
	//      * * * 
	//        *
   static void Pattern10(int n)
   {		
   		for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
    //Pattern 11 Rhombus 
    //       * * * * * * * * 
    //      * * * * * * * * 
    //     * * * * * * * * 
    //    * * * * * * * * 
    //   * * * * * * * * 
    //  * * * * * * * * 
    // * * * * * * * * 
    //* * * * * * * * 
    static void Pattern11(int n)
    {
        for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
    }
    static void Pattern12(int n ){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int s = 2 * (n - i);
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) { // Start from n-1 to avoid duplicate middle row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int s = 2 * (n - i);
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
