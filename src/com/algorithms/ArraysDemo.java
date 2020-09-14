package com.algorithms;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        // allocate and initialize array
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }

        // display, sort and display the array
        System.out.println("Original contents: ");
        display(array);
        Arrays.sort(array);
        System.out.println("Sorted array: ");
        display(array);

        // fill and display the array
        Arrays.fill(array, 2, 6, -1);
        System.out.println("After fill(): ");
        display(array);

        // sort and display the array
        Arrays.sort(array);
        System.out.println("After sorting again: ");
        display(array);

        // binary search for -9
        System.out.print("The value -9 is at location: ");
        int index = Arrays.binarySearch(array, -9);

        System.out.print(index);
    }
    static void display(int array1[]) {
        for(int i: array1)
            System.out.print(i + " ");

        System.out.println();
    }
}
