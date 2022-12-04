package com.examples.algorithms.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int counter;
        int size;
        int[] array;
        int target;
        int first = 0;
        int last;

        Scanner input = new Scanner(System.in);

        System.out.println("Input size of array: ");
        size = input.nextInt();
        array = new int[size];

        System.out.println("input " + size + " numbers:");

        for (counter = 0; counter < size; counter++)
            array[counter] = input.nextInt();

        System.out.println("Input target for binary search: ");
        target = input.nextInt();
        last = size - 1;
        Arrays.sort(array);
        binarySearch(array, first, last, target);
    }

    public static void binarySearch(int[] array, int first, int last, int target) {
        int position = (first + last) / 2;

        while (array[position] != target && first <= last) {
            if (array[position] > target) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (last + first) / 2;
        }
        if (first <= last) {
            System.out.println("target element=" + target + " was found at index=" + position + " in array=" + Arrays.toString(array));
        } else {
            System.out.println("target element not found in array");
        }
    }
}
