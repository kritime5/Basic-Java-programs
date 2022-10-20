package com.bridgelab.day6;
import java.util.Scanner;

        public class StopWatch {

            public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);
                long start,end;
                double time;


                System.out.println("type any character to stopwatch");

                char s  = sc.next().charAt(0);
                start=System.currentTimeMillis();
                System.out.println("type any character to stop the stopwatch");
                char m = sc.next().charAt(0);
                end=System.currentTimeMillis();
                time=(end-start)/1000.0;
                System.out.println(time);
            }
        }

