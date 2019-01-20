package com.xavi.algortihms;

import java.util.Arrays;

public class MergeSort {

    /**
     * Time complexity O(n*log(n))
     * Space complexity O(n)
     *
     * @param array array
     * @param n length
     */
    public void mergeSort(int[] array, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(array, l, r, mid, n - mid);
    }

    public void merge(
            int[] array, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                array[k++] = l[i++];
            } else {
                array[k++] = r[j++];
            }
        }
        while (i < left) {
            array[k++] = l[i++];
        }
        while (j < right) {
            array[k++] = r[j++];
        }
    }

    public static void main(String[] args) {
        int[] array = {5,3,6,8,0};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }
}
