package com.corbinmcguire.corbinmcguire_homework2;

import java.util.Calendar;
import java.util.Date;

/**
 * TimeDate serves as the model in this MVC application
 */
public class TimeDate {

    // Create all member variables.
    //TODO Instantiate all member variables in TimeDate to have the real-time values.
    private int hour;
    private int minute;
    private int second;
    private int month;
    private int day;
    private int year;
//    private Date currentTime;
//    private Calendar currentDate;
    private static TimeDate tdInstance;

    /**
     * Instantiating a new TimeDate object gets the current system time.
     */
    private TimeDate() {
//        currentTime = Calendar.getInstance().getTime();
    }

    /**
     * Implement Singleton Design Pattern to ensure the same TimeDate object is used throughout the
     * application.
     * @return TimeDate instance.
     */
    public static TimeDate getTdInstance(){
        if(tdInstance == null)
            tdInstance = new TimeDate();
        return tdInstance;
    }

    // Getter & Setters for all member variables w/ some error checking.
    public int getHour(){
        return this.hour;
    }
    public void setHour(int h){
        if(h > 24)
        {
            this.hour = 24;
//            currentTime.setTime(24);
        }
        else {
            this.hour = h;
//            currentTime.setTime(h + minute + second);
        }
    }

    public int getMinute(){
        return this.minute;
    }
    public void setMinute(int min){
        if (min > 60)
            this.minute = 60;
        else
            this.minute = min;
    }

    public int getSecond(){
        return this.second;
    }
    public void setSecond(int s){
        if (s > 60)
            this.second = 60;
        else
            this.second = s;
    }

    public int getMonth(){
        return this.month;
    }
    public void setMonth(int mon){
        if (mon > 12)
            this.month = 12;
        else
            this.month = mon;
    }

    public int getDay(){
        return this.day;
    }
    public void setDay(int d){
        if (this.month == 1 && d > 31)
            this.day = 31;
        if (this.month == 2 && d > 28)
            this.day = 28;
        if (this.month == 3 && d > 31)
            this.day = 31;
        if (this.month == 4 && d > 30)
            this.day = 30;
        if (this.month == 5 && d > 31)
            this.day = 31;
        if (this.month == 6 && d > 30)
            this.day = 30;
        if (this.month == 7 && d > 31)
            this.day = 31;
        if (this.month == 8 && d > 31)
            this.day = 31;
        if (this.month == 9 && d > 30)
            this.day = 30;
        if (this.month == 10 && d > 31)
            this.day = 31;
        if (this.month == 11 && d > 30)
            this.day = 30;
        if (this.month == 12 && d > 31)
            this.day = 31;
        else
            this.day = d;
    }

    public int getYear(){
        return this.year;
    }
    public void setYear(int y){
        if (y < 1) {
            this.year = 1;
//            currentDate.set(1, month, day);
        }
        else {
            this.year = y;
//            currentDate.set(y, month, day);
        }
    }

    public String printTime() {
        return hour + ":" + minute + ":" + second;
    }

    public String printDate() {
        return month + "/" + day + "/" + year;
    }


}
