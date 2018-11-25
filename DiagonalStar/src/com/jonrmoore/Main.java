package com.jonrmoore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printSquareStar(24);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (
                        // Conditions for printing star
                        row == 1
                        || col == 1
                        || row == number
                        || col == number
                        || row == col
                        || col == (number - row) +1
                ) {
                    System.out.print("*");
                }
                else { // Else print a space
                    System.out.print(" ");
                }
            } // Enter new line at the end of each row
            System.out.print("\n");
        }
    }
}
