package com.bridgelab.day5;

public class HarmonicNum {
    public static void main(String[] args) {
        int num=5;
        double result=0.0;
        System.out.println("Harmonic series is");
        while(num>0){
            result=result+(double)1/num;
            num--;
            System.out.println(result +" ,");
        }
    }
}
