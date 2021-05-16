package com.learning;

import java.util.HashMap;
import java.util.Map;

public class DecimalConversion {

    public static void main(String[] args) {
        System.out.println(fractionToDecimal(1, 3));
    }

    /***
     * 
     * first get reaminder put the remiander in map if the remainer repeats put the
     * leanth
     * 
     * @param numerator
     * @param denominator
     * @return
     */
    private static String fractionToDecimal(int numerator, int denominator) {

        boolean isNeg = false;
        if (numerator >= 0 ^ denominator >= 0) {
            isNeg = true;

        }
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        String result = (num / den) + "";
        long reminder = (num % den) * 10;

        if (reminder == 0) {
            return isNeg && !result.equals("0") ? "-" + result : result;
        }
        if (reminder > 0) {
            result += ".";
        }
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        while (reminder > 0) {

            if (map.get(reminder) != null) {
                int beg = map.get(reminder);
                result = result.substring(0, beg) + "(" + result.substring(beg) + ")";
                break;

            }
            map.put(reminder, result.length());
            result += reminder / den;
            reminder = (reminder % den) * 10;

        }
        if (isNeg) {
            result = "-" + result;
        }
        return result;
    }
}
