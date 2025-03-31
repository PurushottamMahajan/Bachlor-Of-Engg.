package OOPs;

public class StaticExample {
    static int count = 0;
    static String appName;
 // Static block to initialize static variables
    static {
        System.out.println("Static block executed.");
        appName = "Static Demo App";
    }
 // Static method to display the value of count
    public static void displayCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        System.out.println("App Name: " + appName);
        Counter.increment();
        Counter.increment();
        Counter.increment();
        displayCount();

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        User.displayUser(user1);
        User.displayUser(user2);
// Create instance of static nested class and display its value
        Outer.Nested obj = new Outer.Nested("Orange");
        System.out.println("Color: " + obj.color);
    }
}
// Class with a static method to increment count
class Counter {
    static void increment() {
        StaticExample.count++;
    }
}
// Class to demonstrate static method accessing instance data using object
class User {
    String name;

    User(String name) {
        this.name = name;
    }

    static void displayUser(User user) {
        System.out.println("User Name: " + user.name);
    }
}
// Outer class with a static nested class
class Outer {
    static class Nested {
        String color;

        Nested(String color) {
            this.color = color;
        }
    }
}
