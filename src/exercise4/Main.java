package exercise4;

public class Main {
    public static void main(String[] args) {
        MyPoint first = new MyPoint();
        MyPoint second= new MyPoint(10, 30.5);
        System.out.println("The distance is equal "+MyPoint.distance(first, second));
    }
}
