package exercise13;

public class MyRectangle2D {
    private double x, y;
    private double width, height;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double x, double y) {
        return (this.x - this.width / 2 < x && x < this.x + this.width / 2) && (this.y - this.height / 2 < y && y < this.y + this.height / 2);
    }

    public boolean contains(MyRectangle2D r){
        return (this.x - this.width / 2 < r.x && x < this.x + this.width / 2) && (this.y - this.height / 2 < y && y < this.y + this.height / 2);
    }

    public boolean overlaps(MyRectangle2D r){
        return (r.y + r.height / 2 > y + height / 2 && y + height / 2 > r.y - r.height / 2
                || r.y + r.height / 2 > y - height / 2 && y - height / 2 > r.y - r.height / 2
                || r.x - r.width / 2 < x - width / 2 && r.x + r.width / 2 > x - width / 2
                || r.x - r.width / 2 < x + width / 2 && r.x + r.width / 2 > x + width / 2);
    }
}
