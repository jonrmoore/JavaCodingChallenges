package com.jonrmoore;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(0, 5, 8));
        System.out.println(canPack(6, 3, 2));
        System.out.println(canPack(5, 9, 19));
        System.out.println(canPack(3, 4, -12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int totalWeight = (bigCount*5) + smallCount;

        if (((goal % 5) <= smallCount) && (totalWeight >= goal)) {
            return true;
        }

        return false;
    }
}
