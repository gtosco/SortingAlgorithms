package com.gtoscano.sortingalgorithms;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class QuickSortingTest extends TestCase {
    @Test
    public void testQuickSorting(){
        int[] array = {6, 6, 5, 8, 15, 3, 21, 21, 35, 2, -1, -1};
        int[] expectedArray = {-1, -1, 2, 3, 5, 6, 6, 8, 15, 21, 21, 35};
        QuickSorting.randomizedQuickSort(array, 0, array.length - 1);
        Assert.assertArrayEquals(expectedArray, array);
    }
}