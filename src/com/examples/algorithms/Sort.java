package com.examples.algorithms;

import java.util.Arrays;

public abstract class Sort<T> {

    String name;

    public Sort(String name) {
        this.name = name;
    }

    public final void doSorting(T[] array) {
        long start = System.currentTimeMillis();
        this.sort(array);
        long finish = System.currentTimeMillis();
        this.printResult(finish - start, array);

    }
    protected abstract void sort(T[] array);

    private void printResult(long time, T[] arrayAfterSorting) {
        System.out.println("Sorting name: " + name);
        System.out.println("Sorting time: " + time + " ms");
        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(arrayAfterSorting));
        System.out.println(System.lineSeparator());
    }
}
