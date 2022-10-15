package com.bridgelab.day3;

public class SecondLargestNum {
    public static int getSecondLargest(int [] a,int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 2];
    }


    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={44,66,33,44,55};
        System.out.println("Second largest num"+getSecondLargest(a,5));
        System.out.println("Second largest num"+getSecondLargest(b,5));

    }
}


