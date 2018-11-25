package com.jonrmoore;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(221));
        System.out.println(getLargestPrime(67));
        System.out.println(getLargestPrime(3));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;

        int divisor = 2;

        do {
            while (number % divisor != 0) {
                divisor++;
                if (divisor % 2 == 0)
                    divisor++;
            }

            number /= divisor;

        } while (number != 1);

        return divisor;
    }
}

