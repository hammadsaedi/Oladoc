import java.io.Serializable;

public class Time implements Serializable {
    private int second;
    private int minute;
    private int hour;

    public Time(int second, int minute, int hour, int day, int month, int year) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Time other = (Time) obj;
        if (second != other.second)
            return false;
        if (minute != other.minute)
            return false;
        if (hour != other.hour)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return hour + " : " + minute + " : " + second;
    }
}
