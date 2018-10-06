package com.jonmoore;

public class Main {

    public static void main(String[] args) {
	// returns true if perfect number (the sum of all positive divisors minus the number itself equal the number)
        System.out.println(isPerfectNumber(6)); // i.e. 1 + 2 + 3 = 6; returns true
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int num) {
        if (num < 1) {
            return false;
        }

        int i = 1;
        int compareValue = 0;
        while (i < num) {
            if (num % i == 0) {
                compareValue += i;
            }

            if (compareValue == num)
                return true;

            i++;
        }

        return false;
    }
}
