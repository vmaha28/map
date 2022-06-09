package com.fastrack;

public class Clock {
    private int hour;
    private int minute;

    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute){
        this.minute= minute;
    }


    String getTime() {
        return hour + ":" + minute;
    }

    int getHour() {
        return hour;
    }

}
