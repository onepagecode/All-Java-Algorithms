package SortingAlgorithms;


import java.util.*;
import java.util.Collections;
import java.util.stream.IntStream;

class BucketSort {


    static void bucketSort(float arr[], int n)
    {
        if (n <= 0)
            return;


        Vector<Float>[] buckets = IntStream.range(0, n).mapToObj(i -> new Vector<Float>()).toArray(Vector[]::new);


        IntStream.range(0, n).forEachOrdered(i -> {
            float idx = arr[i] * n;
            buckets[(int) idx].add(arr[i]);
        });


        Arrays.stream(buckets, 0, n).forEachOrdered(Collections::sort);


        int index = 0;
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < buckets[i].size()) {
                arr[index++] = buckets[i].get(j);
                j++;
            }
            i++;
        }
    }


    public static void main(String args[])
    {
        float arr[] = { (float)0.897, (float)0.565,
                (float)0.656, (float)0.1234,
                (float)0.665, (float)0.3434 };

        int n = arr.length;
        bucketSort(arr, n);

        System.out.println("Sorted array is ");
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print(arr[3] + " ");
        System.out.print(arr[4] + " ");
        System.out.print(arr[5] + " ");
    }
}
