package com.gtoscano;

import com.gtoscano.sortingalgorithms.mergeSorting;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(mergeSorting.mergeSort(a, 0, a.length));
    }
}
