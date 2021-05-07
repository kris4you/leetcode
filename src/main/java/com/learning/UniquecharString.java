package com.learning;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniquecharString {

    public static int firstUniqChar(String s) {

        Map<Character, Long> map = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (int i = 0; i < s.length(); i++) {

            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(firstUniqChar("loveleetcode"));
    }
}
