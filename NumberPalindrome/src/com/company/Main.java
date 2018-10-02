package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDigit(1234));
        System.out.println(addDigitToReverse(32, 9));
        System.out.println(isPalindrome(454));
        System.out.println(isPalindrome(2345));
        System.out.println(isPalindrome(45));
        System.out.println(isPalindrome(927282729));
        System.out.println(isPalindrome(99));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int initNum = number;

        while (number > 0) {
            int digit = number % 10;
            reverse = addDigitToReverse(reverse, digit);
            number /= 10;
//            System.out.println("Changed number: " + number + "\nReverse: " + reverse + "\nInitial Value: " + initNum);
        }

        if (initNum == reverse) {
            return true;
        }

        return false;
    }

    public static int getDigit(int num) {
        int digit = num % 10;
        return digit;
    }

    public static int addDigitToReverse(int num, int newDig) {
        int numWithNewDigit = (num * 10) + newDig;
        return numWithNewDigit;
    }
}
