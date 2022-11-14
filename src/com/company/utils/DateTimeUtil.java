package com.company.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    static SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

    public static String changeDateFormat(Date date){
        return dateFormat.format(date);
    }
    public static String changeTimeFormat(Date time){
        return timeFormat.format(time);
    }
}
