package com.jonrmoore;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your year of birth:");
//        boolean hasInt = scanner.hasNextInt();
//        int yearOfBirth = scanner.nextInt();
//        scanner.nextLine();
//
//        if (hasInt) {
//            System.out.println("Enter your name:");
//            String name = scanner.nextLine();
//
//            int age = 2018 - yearOfBirth;
//
//            if (age >= 0 && age <= 100) {
//                System.out.println("Your name is " + name + " and you are " + age + " years of age.");
//            } else {
//                System.out.println("Invalid birth year");
//            }
//        } else {
//            System.out.println("Please type a number");
//        }
//
//        scanner.close();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (count != 10) {
            System.out.println("Enter number #" + (count + 1) + ":");
            boolean hasInt = scanner.hasNextInt();
            if(hasInt) {
                int input = scanner.nextInt();
                System.out.println("You entered " + input);
                sum += input;
                count++;
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine();
        }

        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
