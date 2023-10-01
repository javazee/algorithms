package com.examples.algorithms.insertion;

import com.examples.algorithms.Sort;

public class InsertionSort<T extends Comparable<T>> extends Sort<T> {
    public InsertionSort(String name) {
        super(name);
    }

    //66 89 44 3 5 77
    @Override
    protected void sort(T[] array) {
        for (int i = 0; i < array.length; i ++) {
            T current = array[i];
            int j = i;
            while (j > 0 && array[j-1].compareTo(current) > 0) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = current;
        }
    }
}
