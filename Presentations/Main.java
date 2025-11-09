
abstract class Shape {

    private String color;
    private boolean filled;

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea();

    public String toString() {
        return "[color=" + color + ", filled=" + filled + "]";
    }
}

class Circle extends Shape {

    double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}

class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
}

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("Red", true, 5.0);
        Rectangle rectangle = new Rectangle("Blue", false, 4.0, 6.0);

        System.out.println(circle);
        System.out.println("Area of Circle: " + circle.getArea() + "\n");

        System.out.println(rectangle);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}
