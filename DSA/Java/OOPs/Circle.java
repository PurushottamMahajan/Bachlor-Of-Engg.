package OOPs;

class Circle extends Shape {
    int radius;

    Circle(String color, int borderWidth, int radius) {
        super(color, borderWidth);
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
}