package com.johncross;

public class DecimalComparator {

    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(-3.123, 3.123);

    }

    public static boolean areEqualByThreeDecimalPlaces (double x, double y) {

        double newX = x * 1000;
        double newY = y * 1000;

        newX = (int) newX;
        newY = (int) newY;
        if (newX - newY == 0) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }

    }
}
