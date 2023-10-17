package Tests;

import Sorters.AbstractSorter;
import Sorters.BubbleSorter;
import Sorters.QuickSorter;

import Tasks.*;

import java.util.Arrays;

public class TestSorters {
    public static void main(String[] args) {
        int[] arr = {-5, 20, -13, 14 , 11, 21, -21};

        System.out.println("Unsorted array: " + Arrays.toString(arr));

        AbstractSorter bubbleSorter = new BubbleSorter();
        int[] bubbleArr = arr.clone();
        bubbleSorter.sort(bubbleArr);
        System.out.println("Bubble sorted: " + Arrays.toString(bubbleArr));

        AbstractSorter quickSorter = new QuickSorter();
        int[] quickArr = arr.clone();
        quickSorter.sort(quickArr);
        System.out.println("Quick sorted: " + Arrays.toString(quickArr));

        /*Sorters.AbstractSorter mergeSorter = new Sorters.MergeSorter();
        int[] mergeArr = arr.clone();
        mergeSorter.sort(mergeArr);
        System.out.println("Merge sorted: " + Arrays.toString(mergeArr));*/

        SortingTask sortingTask = new SortingTask("1", "descriere", arr, new BubbleSorter());
        sortingTask.execute();
    }
}
