package com.dsimon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int count = 5;
	    int[] array = readIntegers(5);

        System.out.println(Arrays.toString(array));

        int lowestNumber = findMin(array);
        System.out.println("The lowest number entered was: " + lowestNumber);
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];

        int index = 0;
        while (index < array.length) {
            System.out.println("Enter number " + (index + 1) + " out of " + count);
            boolean hasNextInt = scanner.hasNextInt();

            if (!hasNextInt) {
                System.out.println("That wasn't a number!");
            } else {
                array[index] = scanner.nextInt();
                index++;
            }
            scanner.nextLine();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int lowestNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < lowestNumber) {
                lowestNumber = array[i];
            }
        }
        return lowestNumber;
    }
}
