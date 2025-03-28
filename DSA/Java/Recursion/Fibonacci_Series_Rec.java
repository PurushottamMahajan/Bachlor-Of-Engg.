package codes;
class Fibonacci_Series_Rec {
    public static void main(String[] args) {
        int n=50;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(FibonacciSeries(i) + " ");
        }
    }   
    static int FibonacciSeries(int n)
    {
        if(n<2)
        return n;

        return FibonacciSeries(n-1)+FibonacciSeries(n-2);
    }
}
