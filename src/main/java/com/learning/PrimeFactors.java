package com.learning;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    
    public static List<Integer>primeFactor(int x){

        List<Integer> list=new ArrayList<>();
        
        for(int i=2;i<=x;i++){

            while(x%i==0){
                list.add(i);
                x=x/i;
            }
        }
        
        return list;
    }

    public static void main(String[] args) {
        System.out.println(primeFactor(169));
    }
}
