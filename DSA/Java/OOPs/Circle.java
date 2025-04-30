package OOPs;
class Circles extends Shape {
    int radius;

    Circles(String color, int borderWidth, int radius) {
        super(color, borderWidth);
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
}