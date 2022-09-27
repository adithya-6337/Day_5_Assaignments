package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        boolean leap;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Year :");
        int year = scanner.nextInt();

        //A year divisible by 4 is a leap year
        if (year % 4 == 0) {

            //It is a centenary year if the value is divisible by 100 with no remainder.
            if (year % 100 == 0) {

                //Centenary year is a leap year divided by 400
                leap = year % 400 == 0;
            }
            // if the year is not a century
            else leap = true;
        }
        //The Year is not a leap year
        else leap = false;

        if (leap) System.out.println(year + " is a leap year.");
        else System.out.println(year + " is not a leap year.");
    }
}
