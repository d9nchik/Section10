package exercise1;

public class Main {
    public static void main(String[] args) {
        Time first = new Time();
        Time second = new Time(555550000);
        Time third = new Time(5, 23, 55);
        showTime(first);
        showTime(second);
        showTime(third);
    }

    public static void showTime(Time my) {
        System.out.printf("%02d:%02d:%02d\n", my.getHour(), my.getMinute(), my.getSecond());
    }
}
