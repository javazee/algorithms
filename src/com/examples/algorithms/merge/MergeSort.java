package com.examples.algorithms.merge;

import com.examples.algorithms.Sort;

public class MergeSort<T extends Comparable<T>> extends Sort<T> {

    public MergeSort(String name) {
        super(name);
    }

    @Override
    protected void sort(T[] array) {
        int size = array.length;
        if (size < 2) {
            return;
        }

        int mid = size/2;

        T[] left = (T[]) new Comparable[mid];
        T[] right = (T[]) new Comparable[size - mid];
        for (int i = 0; i < mid; i ++) {
            left[i] = array[i];
        }
        for (int i = 0; i < size - mid; i ++) {
            right[i] = array[i+mid];
        }
        sort(left);
        sort(right);

        merge(array, left, right, mid, size - mid);
    }

    private void merge(T[] array, T[] left, T[] right, int leftSize, int rightSize) {
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i].compareTo(right[j]) < 0) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < leftSize) {
            array[k++] = left[i++];
        }
        while (j < rightSize) {
            array[k++] = right[j++];
        }
    }
}
