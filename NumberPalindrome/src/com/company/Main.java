package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(returnLastDigit(-1234));
//        System.out.println(returnNextToLastDigit(-1234));
        System.out.println(addDigitToReverse(32, 9));
        System.out.println(isPalindrome(454));
        System.out.println(isPalindrome(2345));
        System.out.println(isPalindrome(45));
        System.out.println(isPalindrome(927282729));
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int initNum = number;

        while (number > 0 || number < 0) {
            int digit = returnLastDigit(number);
            reverse = addDigitToReverse(reverse, digit);
            number /= 10;
        }

        if (initNum == reverse) {
            return true;
        }

        return false;

    }

//    public static int returnNextToLastDigit (int num) {
//
//        num /= 10;
//        int nextToLastDigit = num % 10;
//        return nextToLastDigit;
//    }

    public static int returnLastDigit (int num) {
        int lastDigit = num % 10;
        return lastDigit;
    }

    public static int addDigitToReverse(int num, int newDig) {
        int numWithNewDigit = (num * 10) + newDig;
        return numWithNewDigit;
    }


}
