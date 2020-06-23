package com.dwb.utils;

/**
 * @author manke
 * @date 2020-03-30 14:33
 */
public class IPCheckUtils {
    public  static boolean ipCheck(String str) {
        if( str != null && !str.isEmpty()){
            String pattern = "^(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}$";
            //String regex="^([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}$";
            if(str.matches(pattern))
                return true;
            return false;

        }
        return false;
    }
}
