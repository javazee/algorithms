package com.examples.algorithms.bubble;

import com.examples.algorithms.Sort;

public class BubbleSort<T extends Comparable<T>> extends Sort<T> {

    public BubbleSort(String name) {
        super(name);
    }

    @Override
    public void sort(T[] array) {
        int bubble = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < bubble; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j);
                }
            }
            bubble--;
        }
    }

    private void swap(T[] array, int j) {
        T tmp = array[j];
        array[j] = array[j+1];
        array[j+1] = tmp;
    }
}
