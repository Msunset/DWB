package com.dwb.utils;

/**
 * @author manke
 * @date 2020-03-27 17:19
 */
public class RandomStringUtil {

    public static final String BASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

    public static final String LETTER_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static final String LETTER_UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static final String LETTER_LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";

    public static final String NUMBER_CHARS = "1234567890";

    public static final String SPECIAL_CHARS = "!@#$%^&*";

    /**
     * 生成指定长度字符串，默认不包含特殊字符
     * @param length 生成字符串长度
     * @return
     */
//    public static String create(int length) {
//        return create(length, false);
//    }

    /**
     * 生成随机字符串
     * @param length 生成字符串长度
     * @param hasSpecial 是否包含特殊字符
     * @return
     */
//    public static String create(int length, boolean hasSpecial) {
//        String chars = hasSpecial ? BASE_CHARS.concat(SPECIAL_CHARS) : BASE_CHARS;
//        return create(length, chars);
//    }

    /**
     * 在指定的字符内生成指定长度字符串
     * @param length
     * @return
     */
    public static String create(int length) {
        StringBuffer sb = new StringBuffer();
        int len = BASE_CHARS.length();
        for (int i = 0; i < length; i++) {
            int index = (int) Math.round(Math.random() * (len - 1));
            sb.append(BASE_CHARS.charAt(index));
        }
        return sb.toString();
    }
}
