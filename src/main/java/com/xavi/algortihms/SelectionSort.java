package com.xavi.algortihms;

public class SelectionSort {

    /**
     * Time complexity O(n^2)
     * Space complexity O(1)
     *
     * @param array
     */
    public void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            int tmp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = tmp;
        }
    }

}
