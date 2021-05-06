package com.learning;

public class Sqrt {
    
    public static double sqrt(double x){
        double n=x;
        double root;
        while(true){
            root=0.5*(x+n/x);   
            if(Math.abs(root-x)<1){
                break;
            }
            x=root;
        }
        return root;
    }
    public static void main(String[] args) {
     
        System.out.println(sqrt(8));
    }
}
