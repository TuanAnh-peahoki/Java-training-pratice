package com.company.models;

import com.company.utils.DateTimeUtil;

import java.util.Date;

public class Call {
    private Date date;
    private Date time;
    private String phoneNumber;
    private String duration;

    public Call(){}
    public Call(Date date, Date time, String phoneNumber, String duration){
        this.date = date;
        this.time = time;
        this.phoneNumber = phoneNumber;
        this.duration = duration;
    }

    public String getDate() {
        return  DateTimeUtil.changeDateFormat(date);
    }

    public String getTime() {
        return DateTimeUtil.changeTimeFormat(time);
    }

    public String getDuration() {
        return duration;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString(){
        return " -Date: " + date  + " -Time: "+ time + " -PhoneNumber: "+ phoneNumber +" -duration: "+ duration;
    }
}
