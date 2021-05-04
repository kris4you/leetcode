package com.learning;

import java.util.Arrays;

public class DecodeArray {

     public static int[] decode(int[] encoded, int first) {
        
        int []elements=new int[encoded.length+1];
        elements[0]=first;
        for(int i=0;i<encoded.length;i++){
            elements[i+1]=encoded[i]^elements[i];
        }

        return elements;
    }

    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(decode(new int[]{6,2,7,3}, 4)));
    }
    
}
