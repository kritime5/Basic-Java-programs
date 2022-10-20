package com.bridgelab.day1;

public class SumCl {

        public static void main(String [] args){
            int sum=0;
            System.out.println("calculate sum of integers");
            String[] values = new String[0];
            for(int i = 0; i<values.length; i++){
                System.out.println(values[i]);
                try {
                    sum = sum + Integer.parseInt(values[i]);
                }catch (NumberFormatException e){
                    System.out.println("Invalid integer command line arguments:"+e.toString())
                    ;
                }

            }
            System.out.println("Sum:+sum");
        }
    }

