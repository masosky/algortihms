package com.xavi.algortihms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BubbleSortTest {

    private BubbleSort bubbleSort;

    @org.testng.annotations.BeforeMethod
    public void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void bubbleSort() {
        int[] array = {3, 2, 6, 5, 7, 8, 9, 6};
        bubbleSort.bubbleSortEx(array);

        Assert.assertEquals(array, new int[]{2, 3, 5, 6, 6, 7, 8, 9});
    }

    @Test
    public void bubbleSort2() {
        int[] array = {3};
        bubbleSort.bubbleSortEx(array);

        Assert.assertEquals(array, new int[]{3});
    }
}