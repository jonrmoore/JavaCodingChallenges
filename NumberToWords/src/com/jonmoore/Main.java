package com.jonmoore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        numberToWords(123);
        numberToWords(001);
//        System.out.println(reverse(7893));
    }

    public static void numberToWords(int num) {
        // reverse number
        int reversedNum = reverse(num);

        int digitCount = getDigitCount(num);
        int reversedDigitCount = getDigitCount(reversedNum);

        if (reversedNum < 0) {
            System.out.println("Invalid Value");
        }

        while (reversedNum > 0) {
            switch(reversedNum % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Last digit not found");
            }

            reversedNum /= 10;
        }

        for (int i = (digitCount - reversedDigitCount); i > 0; i--) {
            System.out.println("Zero");
        }
    }

    // Without reversing the input, the output prints in opposite order.
    private static int reverse(int num) {
        int reversedNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum *= 10;
            reversedNum += lastDigit;
            num /= 10;
        }

        return reversedNum;
    }

    // To leading zeroes to print "zero" rather than nothing
    private static int getDigitCount(int num) {
        if (num < 0) {
            return -1;
        }

        int count = 0;
        for (int i = 0; i <= num; i *= 10) {
            if (i == 0) {
                i++;
            }

            count++;
        }

        return count;
    }
}
