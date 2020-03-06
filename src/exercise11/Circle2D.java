package exercise11;

public class Circle2D {
    private double x, y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        return Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2) <= Math.pow(radius, 2);
    }

    public boolean contains(Circle2D circle) {
        return radius - circle.radius >= 0 && (Math.sqrt(Math.pow((this.x - circle.x), 2) + Math.pow((this.y - circle.y), 2))) <= radius - circle.radius;
    }

    public boolean overlaps(Circle2D circle) {
        return (Math.sqrt(Math.pow((this.x - circle.x), 2) + Math.pow((this.y - circle.y), 2))) <= radius + circle.radius;
    }
}
