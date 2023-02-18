package com.epam.demo;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {

        List<Integer> parser = new ArrayList<Integer>();

        for (int i = 0; i < args.size(); i++) {
            if (args.get(i) == "" || args.get(i) == " " || args.get(i) == null) {
                return false;
            }
            parser.add(Integer.parseInt(args.get(i)));
        }
        for (int i = 0; i < parser.size(); i++) {
            {
                if (parser.get(i) <= 0) {
                    return false;
                }
            }
        }
        return true;
    }
}