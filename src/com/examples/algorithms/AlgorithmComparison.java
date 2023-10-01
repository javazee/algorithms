package com.examples.algorithms;

import com.examples.algorithms.bubble.BubbleSort;
import com.examples.algorithms.insertion.InsertionSort;

import java.util.Arrays;
import java.util.Random;

public class AlgorithmComparison {
    public static void main(String[] args) {
        Integer[] arrayBeforeSorting = generateArray();
        System.out.println("Array before sorting: " + Arrays.toString(arrayBeforeSorting));
        System.out.print(System.lineSeparator());

        BubbleSort<Integer> bubbleSort = new BubbleSort<>("Bubble sorting");
        bubbleSort.doSorting(arrayBeforeSorting.clone());

        InsertionSort<Integer> insertionSort = new InsertionSort<>("Insertion sorting");
        insertionSort.doSorting(arrayBeforeSorting.clone());

    }

    private static Integer[] generateArray() {
        return new Random(1000000).ints().limit(1000).boxed().toList().toArray(new Integer[0]);
    }
}
