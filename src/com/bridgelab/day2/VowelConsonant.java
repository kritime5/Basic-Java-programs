package com.bridgelab.day2;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character:" );
        char c=((sc.nextLine()).charAt(0));
        char z=Character.toUpperCase(c);
        switch(z){
            case 'a':
            case 'i':
            case 'o':
            case 'u':
            case 'e':
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            case 'E':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }

    }
}
