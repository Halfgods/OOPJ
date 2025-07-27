class Circle {
    private double radius;
    static int count = 0;

    public Circle(double radius) {
        this.radius = radius;
        count++;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle {
    private double length, breadth;
    static int count = 0;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        count++;
    }

    public double area() {
        return length * breadth;
    }
}
class Triangle {
    private double base, height;
    static int count = 0;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        count++;
    }

    public double area() {
        return 0.5 * base * height;
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        Circle c2 = new Circle(5);

        Rectangle r1 = new Rectangle(4, 6);
        Rectangle r2 = new Rectangle(3, 8);

        Triangle t1 = new Triangle(5, 4);
        Triangle t2 = new Triangle(6, 7);

        System.out.println("Area of Circle 1: " + c1.area());
        System.out.println("Area of Circle 2: " + c2.area());

        System.out.println("Area of Rectangle 1: " + r1.area());
        System.out.println("Area of Rectangle 2: " + r2.area());

        System.out.println("Area of Triangle 1: " + t1.area());
        System.out.println("Area of Triangle 2: " + t2.area());

        System.out.println("Total Circles: " + Circle.count);
        System.out.println("Total Rectangles: " + Rectangle.count);
        System.out.println("Total Triangles: " + Triangle.count);
    }
}
