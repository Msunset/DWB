package com.dwb.utils;

/**
 * @author manke
 * @date 2020-03-18 14:53
 */
public class IsEmpty {
    /**
     * 判断字符串不为空
     * @param str
     * @return
     */
    public static boolean NOT_EMPTY(String str) {
        //StringUtils.isNotEmpty(str);
        return str != null && !"".equals(str);
    }
}
