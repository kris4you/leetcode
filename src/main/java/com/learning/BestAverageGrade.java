package com.learning;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class BestAverageGrade {
    
    public static int bestAvgGrade(String[][]students) {

        Map<String, Double>map=Arrays.stream(students).collect(
            Collectors.groupingBy(arr->arr[0],Collectors.averagingInt(arr->Integer.parseInt(arr[1]))) );
        
            return map.entrySet().stream().max(Map.Entry.comparingByValue(Comparator.comparingDouble(e->e))).get().getValue().intValue();
     
    }

    public static void main(String[] args) {
        
        System.out.println(bestAvgGrade(new String[][]{{"Bob","10"}, {"Mike", "35"},{"Bob", "20"}, {"Bob", "30"},{"Bob","40"},{"Bob","50"},{"Jason","35"}, {"Mike", "55"}, {"Jessica", "99"}}));
    }
}
