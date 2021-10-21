package SortingAlgorithms;

import java.util.stream.IntStream;

// Java implementation of Counting Sort
class CountingSort {
    void sort(char arr[])
    {
        int n = arr.length;


        char output[] = new char[n];


        int count[] = IntStream.range(0, 256).map(i -> 0).toArray();


        IntStream.range(0, n).forEachOrdered(i -> ++count[arr[i]]);


        IntStream.rangeClosed(1, 255).forEachOrdered(i -> count[i] += count[i - 1]);


        IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).forEachOrdered(i -> {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        });


        IntStream.range(0, n).forEachOrdered(i -> arr[i] = output[i]);
    }


    public static void main(String args[])
    {
        CountingSort ob = new CountingSort();
        char arr[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'g', 'e', 'e', 'k', 's' };

        ob.sort(arr);

        System.out.print("Sorted character array is ");
        IntStream.range(0, arr.length).map(i -> arr[i]).forEachOrdered(System.out::print);
    }
}
/*This code is contributed by Rajat Mishra */

