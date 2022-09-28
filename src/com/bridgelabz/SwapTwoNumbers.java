package com.bridgelabz;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 222, b = 111;
        System.out.println("Before Swapping");
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping");
        System.out.println("a is  " + a);
        System.out.println("b is  " + b);
    }
}

