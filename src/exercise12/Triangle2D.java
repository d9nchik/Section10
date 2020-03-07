package exercise12;

import exercise4.MyPoint;

public class Triangle2D {
    private MyPoint p1, p2, p3;

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public Triangle2D() {
        this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea() {
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p2.distance(p3);

        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double getPerimeter() {
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p2.distance(p3);

        return a + b + c;
    }

    public boolean contains(MyPoint p) {
        return isOnMiddle(p, p1, p2, p3) && isOnMiddle(p, p2, p1, p3) && isOnMiddle(p, p3, p1, p2);
    }

    private static boolean isOnMiddle(MyPoint central, MyPoint first, MyPoint second, MyPoint third) {
        MyPoint searchedPoint = intersectingPoint(central, first, second, third);
        return first.distance(central) <= first.distance(searchedPoint);
    }

    public boolean contains(Triangle2D t) {
        return contains(t.p1) && contains(t.p2) && contains(t.p3);
    }

    public boolean overlaps(Triangle2D t) {
        return isOverlaps(t.p1, t.p2, p1, p2) || isOverlaps(t.p1, t.p2, p1, p3) || isOverlaps(t.p1, t.p2, p2, p3) ||
                isOverlaps(t.p1, t.p3, p1, p2) || isOverlaps(t.p1, t.p3, p1, p3) || isOverlaps(t.p1, t.p3, p2, p3) ||
                isOverlaps(t.p3, t.p2, p1, p2) || isOverlaps(t.p3, t.p2, p1, p3) || isOverlaps(t.p3, t.p2, p2, p3);
    }

    public static MyPoint intersectingPoint(MyPoint central, MyPoint first, MyPoint second, MyPoint third) {
        double x1 = central.getX();
        double y1 = central.getY();
        double x2 = first.getX();
        double y2 = first.getY();
        double x3 = second.getX();
        double y3 = second.getY();
        double x4 = third.getX();
        double y4 = third.getY();


        double a = y1 - y2;
        double b = x2 - x1;
        double c = y3 - y4;
        double d = x4 - x3;
        double e = a * x1 + b * y1;
        double f = c * x3 + d * y3;

        LinearEquation my = new LinearEquation(a, b, c, d, e, f);

        return new MyPoint(my.getX(), my.getY());
    }

    public boolean isOverlaps(MyPoint first, MyPoint second, MyPoint first1, MyPoint second1) {
        MyPoint intersecting = intersectingPoint(first, second, first1, second1);
        return ((first.getX() < intersecting.getX() && intersecting.getX() < second.getX()) || (second.getX() < intersecting.getX() && intersecting.getX() < first.getX())) &&
                (first.getY() < intersecting.getY() && intersecting.getY() < second.getY()) || (second.getY() < intersecting.getY() && intersecting.getY() < first.getY());
    }
}
