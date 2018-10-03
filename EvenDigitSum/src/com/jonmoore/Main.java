package com.jonmoore;

public class Main {

    public static void main(String[] args) {
	// return the sum of only the even digits
        System.out.println("Sum of even numbers = " + getEvenDigitSum(123456789));
        System.out.println("Sum of even numbers = "  + getEvenDigitSum(55));
        System.out.println("Sum of even numbers = "  + getEvenDigitSum(68235));
    }

    public static int getEvenDigitSum(int num) {

        if (num < 0) {
            return -1;
        }
        
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            num /= 10;
        }

        return sum;
    }
}
