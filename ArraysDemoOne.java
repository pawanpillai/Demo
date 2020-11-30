package com.cs1131.arrays;

import java.util.Scanner;

public class ArraysDemoOne {
    public static void main(String[] args) {
        int[] arrNumbers = new int[5];
        Scanner input = new Scanner(System.in);

        for (int index = 0; index < arrNumbers.length; index++){
            System.out.print("Enter number: ");
            arrNumbers[index] = input.nextInt();
        }

        System.out.println();
        System.out.println("Items in array with their indexes:");
        for (int index = 0; index < arrNumbers.length; index++){
            System.out.println("Array value at index " + index
                    + " is " + arrNumbers[index]);
        }
    }
}
