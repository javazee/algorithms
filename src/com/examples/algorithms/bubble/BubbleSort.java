package com.examples.algorithms.bubble;

import com.examples.algorithms.Sort;

import java.util.Comparator;

public class BubbleSort<T extends Comparable<T>> extends Sort<T> {

    public BubbleSort(String name) {
        super(name);
    }

    @Override
    public void sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j); //меняем местами
                }
            }
        }
    }

    private void swap(T[] array, int j) {
        T tmp = array[j];
        array[j] = array[j+1];
        array[j+1] = tmp;
    }
}
