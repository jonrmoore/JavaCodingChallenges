package com.jonmoore;

public class Main {

    public static void main(String[] args) {
	// returns the highest number by which both numbers are divisible
        System.out.println(getGreatestCommonDivisor(72, 48));
        System.out.println(getGreatestCommonDivisor(90, 34));
        System.out.println(getGreatestCommonDivisor(876, 1038));
    }

    public static int getGreatestCommonDivisor(int n1, int n2) {

        // validate numbers
        if (n1 < 10 || n2 < 10) {
            return -1;
        }

        // iterate
        for (int i = 1; i < n1; i++) {

            // if n1 is evenly divisible by i
            if ((n1 % i) == 0) {

                // save i
                int divisor1 = n1 / i;

                // repeat for the second number, comparing the two divisors
                for (int j = 1; j < n2; j++) {
                    if ((n2 % j) == 0) {
                        int divisor2 = n2 / j;

                        // compare
                        if (divisor1 == divisor2) {

                            // if there's a match, return the value
                            return divisor1;
                        }
                    }
                }
            }
        }

        // else, get out of town
        return -1;
    }
}
