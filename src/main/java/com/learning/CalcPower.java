package com.learning;

public class CalcPower {
    

    public static double myPow(double x, int n) {
        
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        
       
        double result=pow(x,Math.abs(n));
        if(n<0){
            return 1/result;
        }
        return result;
    }
    
    public static double pow(double x, int n){
         double result=myPow(x,n/2);
        
        if(n%2==0)return result*result;
        else return x*result*result;
    }   
     public static void main(String[] args) {
     
        System.out.println(Integer.MIN_VALUE);
    }
}
