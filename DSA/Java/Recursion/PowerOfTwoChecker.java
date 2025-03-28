package codes;
public class PowerOfTwoChecker {
    public static void main(String[] args) {
        int number = 4

        ; // Example number to check

        if (isPowerOfTwo(number)) {
            System.out.println(number + " is a power of two.");
        } else {
            System.out.println(number + " is not a power of two.");
        }
    }

    // Function to check if a number is a power of two
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        // A number n is a power of two if and only if there is exactly one bit set in its binary representation
        return (n & (n - 1)) == 0;
    }
}
