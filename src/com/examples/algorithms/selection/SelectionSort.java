package com.examples.algorithms.selection;

import com.examples.algorithms.Sort;

import java.util.Arrays;

public class SelectionSort<T extends Comparable<T>> extends Sort<T> {
    public SelectionSort(String name) {
        super(name);
    }

    @Override
    protected void sort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            T min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(min) < 0) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if (minIndex > i) {
                swap(i, minIndex, array);
            }
        }
    }

    private void swap(int leftIndex, int rightIndex, T[] array) {
        T left = array[leftIndex];
        T right = array[rightIndex];
        array[leftIndex] = right;
        array[rightIndex] = left;
    }
}
