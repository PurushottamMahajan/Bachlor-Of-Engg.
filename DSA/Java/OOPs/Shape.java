package OOPs;

abstract class Shape {
    String color;
    int borderWidth;

    Shape(String color, int borderWidth) {
        this.color = color;
        this.borderWidth = borderWidth;
    }

    abstract void draw();

    public void displayShape() {
        System.out.println("This is a shape with color: " + color + " and border width: " + borderWidth);
    }
}
