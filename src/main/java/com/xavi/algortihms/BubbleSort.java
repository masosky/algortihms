package com.xavi.algortihms;

public class BubbleSort {

    /**
     * Complexity O(n^2)
     * Space complexity O(1)
     *
     * @param array
     */
    public void bubbleSortEx(int[] array) {
        int len = array.length;
        int tmp = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {
                if (array[j - 1] > array[j]) {
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }

            }
        }
    }

}