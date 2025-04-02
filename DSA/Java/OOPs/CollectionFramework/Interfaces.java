package OOPs;

interface Shapes {
    void draw();
    double calculateArea();
}

class Circle implements Shapes {
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

class Rectangle implements Shapes {
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
        Shapes circle = new Circle(5);
        circle.draw();
        System.out.println("Area: " + circle.calculateArea());

        Shapes rectangle = new Rectangle(10, 6);
        rectangle.draw();
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
