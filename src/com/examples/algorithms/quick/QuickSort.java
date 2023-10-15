package com.examples.algorithms.quick;

import com.examples.algorithms.Sort;

public class QuickSort<T extends Comparable<T>> extends Sort<T> {


    public QuickSort(String name) {
        super(name);
    }

    @Override
    protected void sort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(T[] array, int l, int r) {
        if (l >= r) {
            return;
        }
        int pivot = partition(array, l, r);
        quickSort(array, l, pivot - 1);
        quickSort(array, pivot + 1, r);
    }

    private int partition(T[] array, int l, int r) {
        T pivot = array[r];
        int ptr = l - 1;
        for (int i = l; i < r; i++) {
            if (array[i].compareTo(pivot) < 0) {
                ptr++;
                swap(array, ptr, i);
            }
        }
        swap(array, ptr + 1, r);
        return ptr + 1;
    }

    private void swap(T[] array, int ptr, int r) {
        T temp = array[r];
        array[r] = array[ptr];
        array[ptr] = temp;
    }
}
