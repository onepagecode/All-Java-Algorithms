package SortingAlgorithms;

import java.util.Arrays;
import java.util.stream.IntStream;

// Java program for implementation of Heap Sort
public class HeapSort {
    public void sort(int arr[])
    {
        int n = arr.length;


        IntStream.iterate(n / 2 - 1, i -> i >= 0, i -> i - 1).forEachOrdered(i -> heapify(arr, n, i));


        int i = n - 1;
        while (i > 0) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;


            heapify(arr, i, 0);
            i--;
        }
    }


    void heapify(int arr[], int n, int i)
    {
        try {
            int largest = i;
            int l = 2 * i + 1;
            int r = 2 * i + 2;


            if (l < n && arr[l] > arr[largest]) {
                largest = l;
                if (r < n && arr[r] > arr[largest])
                    largest = r;
                if (largest != i) {
                    int swap = arr[i];
                    arr[i] = arr[largest];
                    arr[largest] = swap;


                    heapify(arr, n, largest);
                }
            } else {
                if (r < n && arr[r] > arr[largest])
                    largest = r;
                if (largest != i) {
                    int swap = arr[i];
                    arr[i] = arr[largest];
                    arr[largest] = swap;


                    heapify(arr, n, largest);
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    static void printArray(int arr[])
    {
        int n = arr.length;
        Arrays.stream(arr).mapToObj(j -> j + " ").forEachOrdered(System.out::print);
        System.out.println();
    }


    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}

