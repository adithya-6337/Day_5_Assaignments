package com.bridgelabz;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        int a = 10, b = 14, c = 222;
        if (a > b && a > c) {
            System.out.println("Largest number is:" + a);
        } else if (b > c) {
            System.out.println("Largest number is:" + b);
        } else {
            System.out.println("Largest number is:" + c);
        }
    }
}

