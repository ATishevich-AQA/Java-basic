package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 1 ;
        int b = 1;
        int c;
        System.out.print(a + " " +  b + " ");
        for (int i= 0; b <=1000; i++){
            c= a+b;
            System.out.print(b+" ");
            a= b;
            b= c;
        }
        System.out.println();
    }
}
