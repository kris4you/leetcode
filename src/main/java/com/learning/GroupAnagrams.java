package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

  private static List<List<String>> groupAnagrams(String[] strs) {

    Map<String, List<String>> map = new HashMap<>();

    for (String s : strs) {

      char[] arr = s.toCharArray();
      Arrays.sort(arr);
      String temp = String.valueOf(arr);
      if (map.get(temp) != null) {
        map.get(temp).add(s);
      } else {
        map.put(temp, new ArrayList<String>() {
          {
            add(s);
          }
        });
      }

    }

    return new ArrayList<>(map.values());

  }

  public static void main(String[] args) {

    System.out.println(groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));
  }
}
