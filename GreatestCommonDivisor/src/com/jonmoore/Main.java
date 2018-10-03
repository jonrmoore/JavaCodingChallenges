package com.jonmoore;

public class Main {

    public static void main(String[] args) {
	// returns the highest number by which both numbers are divisible
        System.out.println(getGreatestCommonDivisor(72, 48));
//        testDivisbleNum(72);
    }

    public static int getGreatestCommonDivisor(int n1, int n2) {
        if (n1 < 10 || n2 < 10) {
            return -1;
        }

//        // first iterator
//        int i = 1;
//        int j = 1;
//        if (n1 > n2) {
//
//            while (i < n1 && n2 < i) {
//                int divisor1 = n1 / i;
//
//                while (n2 < i) {
//                    int divisor2 = n2 / i;
//                    if (divisor1 == divisor2) {
//
//                        return divisor1;
//                    }
//
////                    System.out.println("j: " + j);
////                    j++;
//                }
//
//                System.out.println("i: " + i);
//                i++;
//            }
//
//        } else if (n1 < n2) {
//
//            while (i < n2) {
//                int divisor1 = n2 / i;
//
//                while (n1 > j) {
//                    int divisor2 = n1 / i;
//                    if (divisor1 == divisor2) {
//
//                        return divisor1;
//                    }
//
//                    j++;
//                }
//
//                i++;
//            }
//        }
//
//        return -1;
    }

    public static void testDivisbleNum(int num) {
        int count = 1;
        while (count < num) {
            int divisor = num / count;
            System.out.println(num + " / " + count + " = " + divisor);
            count++;
        }
    }
}
