package exercise14;

import java.util.GregorianCalendar;

public class MyDate {
    private int year, month, day;

    public MyDate() {
        this(System.currentTimeMillis());
    }

    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(long elapsedTime){
        GregorianCalendar temp = new GregorianCalendar();
        temp.setTimeInMillis(elapsedTime);
        year = temp.get(GregorianCalendar.YEAR);
        month = temp.get(GregorianCalendar.MONTH);
        day = temp.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
