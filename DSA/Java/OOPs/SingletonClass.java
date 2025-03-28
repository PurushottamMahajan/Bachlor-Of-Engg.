package OOPs;

// Singleton Class
class Singleton {
    // Private static instance (single instance)
    private static Singleton instance;

    // Private constructor to restrict instantiation
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    // Public method to provide global access to the instance
    public static Singleton getInstance() {
        // Create instance only if it's null (lazy initialization)
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

// Main class
public class SingletonClass {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();  // Output: Hello from Singleton!

        // Attempt to get another instance
        Singleton obj2 = Singleton.getInstance();

        // Check if both references point to the same object
        if (obj1 == obj2) {
            System.out.println("Both objects are the same instance.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}
