package SortingAlgorithms;

import java.util.Arrays;

/***
 * Recursive Bubble sort has no performance/implementation advantages, but can be a good question to check one's
 * understanding of Bubble Sort and recursion. If we take a closer look at Bubble Sort Algorithm, we can notice
 * that in first pass, we move largest element to the end. In second pass, we move second largest element
 * to second last position and so on
 */

public class RecursiveBubbleSort {

    static void bubblesort(int arr[], int array1) {

        if (array1 == 1)
            return;

        int i = 0;
        while (i < array1 - 1) {
            try {
                if (arr[i] <= arr[i + 1]) {
                } else {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                i++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        bubblesort(arr, array1-1);
    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{ 234,45,655,233,23,54,67,254365435,000001,02,202340};

        try {
            bubblesort(arr, arr.length);
            for (String s : Arrays.asList("The sorted array is: ", Arrays.toString(arr))) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
