package OOPs;

interface Shape {
    void draw();
    double calculateArea();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing Circle");
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public double calculateArea() {
        return length * width;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.draw();
        System.out.println("Area: " + circle.calculateArea());

        Shape rectangle = new Rectangle(10, 6);
        rectangle.draw();
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
