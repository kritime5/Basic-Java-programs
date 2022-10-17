package com.bridgelab.day5;
import java.util.*;
public class SwapNum {
    public static void main(String[] args) {
        int x,y,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x and y");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Before swapping number"+x+" "+y);
        t=x;
        x=y;
        y=t;
        System.out.println("After  swapping number:"+x+" "+y);
        System.out.println();

    }
}
