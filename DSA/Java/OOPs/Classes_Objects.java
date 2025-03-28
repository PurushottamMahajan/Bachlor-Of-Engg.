package OOPs;

// Class definition
class Car {
    // Instance variables (properties)
    String brand;
    int speed;

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Speed: " + speed + " km/h");
    }

    // Method to accelerate the car
    public void accelerate(int increase) {
        speed += increase;
        System.out.println("Car speed increased to: " + speed + " km/h");
    }
}

// Main class
public class Classes_Objects {
    public static void main(String[] args) {
        // Creating an object of Car class
        Car car1 = new Car();

        // Setting values for the object's properties
        car1.brand = "Toyota";
        car1.speed = 60;

        // Display car details
        car1.displayDetails();

        // Accelerate the car
        car1.accelerate(20);
    }
}

