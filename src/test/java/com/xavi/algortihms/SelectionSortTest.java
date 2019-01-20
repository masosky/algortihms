package com.xavi.algortihms;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SelectionSortTest {

    private SelectionSort selectionSort;

    @BeforeMethod
    public void setUp() {
        selectionSort = new SelectionSort();
    }

    @Test
    public void testSelectionSort() {
        int[] array = {3, 2, 6, 5, 7, 8, 9, 6};
        selectionSort.selectionSort(array);

        Assert.assertEquals(array, new int[]{2, 3, 5, 6, 6, 7, 8, 9});
    }
}