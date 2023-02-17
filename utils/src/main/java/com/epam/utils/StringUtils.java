package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str == " " || str == "") {
            return false;
        }
        float parser = Float.parseFloat(str);
        if (parser > 0) {
            return true;
        }
        return false;
    }
}
