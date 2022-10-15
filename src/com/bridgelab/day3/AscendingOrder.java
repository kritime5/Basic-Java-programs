package com.bridgelab.day3;

public class AscendingOrder {
    public static void main(String[] args) {
        int [] arr=new int [] {5,2,8,7,6};
        int temp=0;
        System.out.println("element of original array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        for(int i=0;i<arr.length; i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[j]=temp;
                }
            }


        }
        System.out.println();
        System.out.println("Element of array sorted in ascending order");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

}
