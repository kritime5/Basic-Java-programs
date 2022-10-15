package com.bridgelab.day3;

public class EvenPosition {
    public static void main(String[] args) {
        int [] arr=new int[] {1,2,3,4,5};
        System.out.println("elements of given arrayon even position");
        for(int i=1;i<arr.length;i=i+2){
            System.out.println(arr[i]);
        }
    }
}
