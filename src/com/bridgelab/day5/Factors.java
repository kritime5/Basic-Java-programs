package com.bridgelab.day5;

public class Factors {
    public static void main(String[] args) {
        int number=60;
        System.out.println("Factors of "+number+"are:");
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.println(i+" ");
            }
        }
    }
}
