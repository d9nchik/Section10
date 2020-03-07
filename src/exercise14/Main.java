package exercise14;

public class Main {


    public static void main(String[] args) {
        MyDate first = new MyDate();
        MyDate second = new MyDate(34355555133101L);
        System.out.println("Year " + first.getYear() + " month " + first.getMonth() + " day " + first.getDay());
        System.out.println("Year " + second.getYear() + " month " + second.getMonth() + " day " + second.getDay());
    }
}
