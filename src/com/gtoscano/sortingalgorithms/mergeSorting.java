package com.gtoscano.sortingalgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeSorting {

    public static int[] mergeSort(int[] a, int left, int right) {

        if (right <= left + 1) {
            return Arrays.copyOfRange(a, left, right);
        }

        int ave = (left + right) / 2;
        int[] leftArray = mergeSort(a, left, ave);
        int[] rightArray = mergeSort(a, ave, right);

        return merge(leftArray, rightArray);
    }

    private static int[] merge(int[] a, int [] b){
        List<Integer> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]){
                mergedList.add(a[i]);
                i++;
            } else {
                mergedList.add(b[j]);
                j++;
            }
        }

        if (i >= a.length - 1 && j <= b.length -1){
            for (int k = j; k < b.length; k++){
                mergedList.add(b[k]);
            }
        } else if (i <= a.length - 1 && j >= b.length -1) {
            for (int k = i; k < a.length; k++){
                mergedList.add(a[k]);
            }
        }

        return mergedList.stream().mapToInt(Integer::intValue).toArray();
    }
}
