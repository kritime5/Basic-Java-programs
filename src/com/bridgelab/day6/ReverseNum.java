package com.bridgelab.day6;

public class ReverseNum {
    public static void main(String[] args) {
        int number=1234,reverse=0;
        while(number!=0){
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        System.out.println("The reverse number of given number is:"+reverse);
    }
}
