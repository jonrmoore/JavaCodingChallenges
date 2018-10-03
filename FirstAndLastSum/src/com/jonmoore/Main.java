package com.jonmoore;

public class Main {

    public static void main(String[] args) {
	// returns the sum of the first and last digits
        System.out.println("sum = " + sumFirstAndLastDigit(923));
    }

    public static int sumFirstAndLastDigit(int num) {
        if (num < 0) {
            return -1;
        }

        int first;
        int last = num % 1;

        do {
            first = num % 10;
            num /= 10;
        } while (num > 0);

        int sum = first + last;

        return sum;
    }
}
