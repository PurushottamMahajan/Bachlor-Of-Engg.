package OOPs.Exceptionhandling;

// User-defined exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main class to demonstrate exception handling
public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            checkAge(15);
            checkAge(20);
        } catch (InvalidAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }

    // Method to check age and throw an exception if age is below 18
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}

