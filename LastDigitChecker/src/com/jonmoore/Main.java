package com.jonmoore;

public class Main {

    public static void main(String[] args) {
	// checks whether at least two numbers share a common last digit
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(58, 233, 90));
        System.out.println(hasSameLastDigit(78, 12, 978));
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        // validate numbers
        if ((n1 < 10 || n1 > 1000) || (n2 < 10 || n2 > 1000) || (n3 < 10 || n3 > 1000)) {
            return false;
        }

        // capture last digits
        int ld1 = n1 % 10;
        int ld2 = n2 % 10;
        int ld3 = n3 % 10;

        // check whether at least one pair share digits
        if ((ld1 == ld2 || ld1 == ld3) || ld2 == ld3) {
            return true;
        }

        // if none do, return false
        return false;
    }
}
