package com.bridgelab.day3;

public class FrequencyOfElementArr {
    public static void main(String[] args) {
        int [] arr =new int [] {1,1,3,1,5,6,6};
        int [] fr= new int [arr.length];
        int visited =-1;
        for(int i=0; i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[i]){
                    count++;
                    fr[j]=visited;

                }
            }
            if(fr[i]!=visited)
                fr[i]=count;
        }
        System.out.println("Element frequency");

        for(int i=0;i<fr.length;i++){
            if(fr[i]!=visited)
                System.out.println(" "+arr[i]+"|"+fr[i]);
        }
    }
}


