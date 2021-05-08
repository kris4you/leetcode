package com.learning;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ApacheLog {

  public static String getIpAddress(String[] lines) {

    Map<String, Long> map = Arrays.stream(lines).map(s -> s.split(" ")[0])
        .collect(Collectors.groupingBy(t -> t, Collectors.counting()));

    long max = map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();

    return map.entrySet().stream().filter(e -> e.getValue() == max).map(e -> e.getKey())
        .collect(Collectors.joining(","));

  }

  public static void main(String[] args) {

    System.out.println(getIpAddress(new String[] { "10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24",
        "10.0.0.2 - GET 2020-08-20", "10.0.0.2 - GET 2020-08-20" }));
  }
}
