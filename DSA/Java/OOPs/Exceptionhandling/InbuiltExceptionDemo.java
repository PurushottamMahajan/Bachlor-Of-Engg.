package OOPs.Exceptionhandling;

// Demonstrate handling of inbuilt exceptions
public class InbuiltExceptionDemo {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }

    // Method to perform division
    static int divide(int a, int b) {
        return a / b;
    }
}
