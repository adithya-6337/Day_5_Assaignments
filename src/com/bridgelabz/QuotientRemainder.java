package com.bridgelabz;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        int dividend, divisor;
        System.out.println("Enter the dividend : ");
        Scanner scanner = new Scanner(System.in);
        dividend = scanner.nextInt();
        System.out.println("Enter the divisor : ");
        divisor = scanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}

