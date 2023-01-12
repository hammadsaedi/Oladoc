package app;

import java.io.Serializable;

public class Timing implements Serializable {
    private Time start;
    private Time end;

    public Timing(Time start, Time end) {
        this.start = start;
        this.end = end;
    }

    public Time getStart() {
        return start;
    }

    public Time getEnd() {
        return end;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public void setEnd(Time end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Timing [Start: " + start + ", End: " + end + "]";
    }
}
