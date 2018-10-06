package com.jonmoore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printFactors(32);
    }

    public static void printFactors(int num) {
        if (num < 1) {
            System.out.println("Invalid Value");
        }

        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                System.out.println(i + " is a factor of " + num + "\n");
            }

            i++;
        }
    }
}
