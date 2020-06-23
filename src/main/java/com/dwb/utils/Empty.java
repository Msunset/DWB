package com.dwb.utils;

/**
 * @author manke
 * @date 2020-03-18 14:53
 */
public class Empty {
    /**
     * 判断字符串不为空
     * @param str
     * @return
     */
    public static boolean STRING_EMPTY(String str) {
        //StringUtils.isNotEmpty(str);
        return str == null ||  str.length()==0;
    }

    public static boolean INT_EMPTY(Integer integer) {
        //StringUtils.isNotEmpty(str);
        return integer == null || integer==0;
    }
}
