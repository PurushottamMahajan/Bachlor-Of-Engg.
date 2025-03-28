package OOPs;

class Person {
    // Private variables - hidden from other classes
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

// Main class
public class Encapsulation {
    public static void main(String[] args) {
        // Create an object of Person
        Person person1 = new Person();

        // Set values using setters
        person1.setName("John Doe");
        person1.setAge(25);

        // Get values using getters
        System.out.println("Name: " + person1.getName());  // Output: Name: John Doe
        System.out.println("Age: " + person1.getAge());    // Output: Age: 25

        // Try setting invalid age
        person1.setAge(-5);  // Output: Age must be positive.
    }
}
