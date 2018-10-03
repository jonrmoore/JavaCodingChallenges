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

        for (int i = 1; i < n1; i++) {
            if ((n1 % i) == 0) {
                int divisor1 = n1 / i;
                for (int j = 1; j < n2; j++) {
                    if ((n2 % j) == 0) {
                        int divisor2 = n2 / j;

                        if (divisor1 == divisor2) {
                            return divisor1;
                        }
                    }
                }
            }
        }

        return -1;
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
