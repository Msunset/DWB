package com.dwb.utils;

import java.sql.Timestamp;
import java.util.Date;

public class TimeStampUtil {
    public static  String timeStamp(){
        Timestamp time = new Timestamp(new Date().getTime());
        return (int) ((time.getTime())/1000)+"";
    }
}
