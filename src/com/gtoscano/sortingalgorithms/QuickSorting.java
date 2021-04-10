package com.gtoscano.sortingalgorithms;

import java.util.Random;

public final class QuickSorting {

    private QuickSorting() {
    }

    private static final Random random = new Random();

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * This partition method is the key-method of the quicksort algorithm.
     * The pivot element p in position l is compared to the elements in the
     * range [l+1, r]. At the end of the procedure, all the elements that are
     * smaller or equal to the pivot are at the left side of p. The elements
     * which are bigger than p are on the right side.
     * @param a array to be sorted
     * @param l position of the pivot
     * @param r position of the last element
     * @return index of the pivot at the end of the sorting procedure
     */
    private static int partition2(int[] a, int l, int r) {
        int p = a[l];
        int j = l;

        for (int i = l + 1; i <= r; i++){
            if (a[i] <= p) {
                j++;  // This index keeps track of index of the last element which is smaller or equal to p
                swap(a, i, j);
            }
        }
        swap(a, l, j);

        return j;
    }

    public static void randomizedQuickSort(int[] a, int l, int r) {
        if (l >= r) {
            return;
        }
        int k = random.nextInt(r - l + 1) + l;

        swap(a, l, k); // This puts the pivot at the beginning of the array

        int m = partition2(a, l, r); // The element a[m] is already in its final position
        randomizedQuickSort(a, l, m - 1);
        randomizedQuickSort(a, m + 1, r);
    }
}
