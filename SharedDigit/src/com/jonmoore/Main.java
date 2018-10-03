package com.jonmoore;

public class Main {

    public static void main(String[] args) {
	// return true if two numbers between 10 and 99 share a common digit
        System.out.println(hasSharedDigit(2, 23));
        System.out.println(hasSharedDigit(12, 26));
        System.out.println(hasSharedDigit(56, 78));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        // validate numbers
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        while (num1 > 0) {
            // capture the digit of num1
            int digit1 = num1 % 10;

            while (num2 > 0) {
                // capture the digit of num2
                int digit2 = num2 % 10;

                // compare digits
                if (digit1 == digit2) {

                    // if they match, return true
                    return true;
                }

                // move num2 to next digit
                num2 /= 10;
            }

            //move num1 to next digit
            num1 /= 10;
        }

        // if there were no matches, return false
        return false;
    }

}
