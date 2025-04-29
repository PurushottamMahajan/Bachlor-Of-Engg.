package Recursion;
import java.util.Scanner;

public class Factorial_Rec {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the Number to Print its Factorial:");
            int n = in.nextInt();
            System.out.println(factorial(n));

            System.out.println("Enter the Number to Print sum form o to that number :");
            n = in.nextInt();
            System.out.println(sum(n));
        }
    }
    static int factorial(int n)
    {
        if(n<=1)
        return 1;
        
        return n*factorial(n-1);
    }
    static int sum(int n)
    {
        if(n<=1)
        return 1;
        
        return n+factorial(n-1);
    }
    
}
