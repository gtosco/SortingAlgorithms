package com.gtoscano.sortingalgorithms;

import org.junit.Assert;
import org.junit.Test;

public class mergeSortingTest {

    @Test
    public void mergeSort() {
        int[] array = {2, 1};
        int[] expectedArray = {1, 2};
        Assert.assertArrayEquals(expectedArray, mergeSorting.mergeSort(array, 0, 2));

        array = new int[] {6, 6, 5, 8, 15, 3, 21, 21};
        expectedArray = new int[]{3, 5, 6, 6, 8, 15, 21, 21};
        Assert.assertArrayEquals(expectedArray, mergeSorting.mergeSort(array, 0, array.length));
    }
}