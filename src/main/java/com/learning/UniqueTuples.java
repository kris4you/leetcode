package com.learning;

import java.util.HashSet;

public class UniqueTuples {
    

    public static HashSet<String> uniqueTuples(String s,int len){

        HashSet<String>hs=new HashSet<>();

        for(int i=0;i<s.length()-len+1;i++){
            hs.add(s.substring(i, i+len));
        }
        return hs;
    }

    public static void main(String[] args) {
        System.out.println(uniqueTuples("abcdef", 3));
    }
}
