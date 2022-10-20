package com.bridgelab.day2;
//palindrom number is number same after reverse
public class PalindromNum {
    public static void main(String[] args) {
        int a,sum=0,temp;
        int n =454;
        temp=n;
        while(n>0){
            a=n%10;
            sum=(sum*10)+a;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrom number");
        else
            System.out.println("not palindrom number");

    }
}
