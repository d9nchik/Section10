package exercise1;

public class Time {
    private int hour, minute, second;



    public  Time(){
        this(System.currentTimeMillis());
    }

    public Time(long timeElapsedMillis){
        this.setTime(timeElapsedMillis);
    }

    public Time(int hour, int minute,int second ){
        this.second=second;
        this.minute=minute;
        this.hour=hour;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapseTimeMillis){
        long currentTimeSeconds = elapseTimeMillis/1000;
        second=(int) (currentTimeSeconds%60);
        long currentTimeMinutes = currentTimeSeconds/60;
        minute=(int)(currentTimeMinutes%60);
        long currentTimeHours = currentTimeMinutes/60;
        hour=(int) (currentTimeHours%24);
    }


}
