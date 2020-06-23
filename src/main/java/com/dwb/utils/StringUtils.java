package com.dwb.utils;

import java.util.Map;

/**
 * @author manke
 * @date 2020-03-27 15:43
 */
public class StringUtils {
    public static String format(String input, Map<String, String> map) {

        // 遍历map,用value替换掉key

        for (Map.Entry<String, String> entry : map.entrySet()) {

            input = input.replace(entry.getKey(), entry.getValue());

        }

        return input;

    }
}
