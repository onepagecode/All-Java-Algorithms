package SortingAlgorithms;

class QuickSort{


    static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    static int Change(int[] array, int low, int high)
    {


        int CenterPoint = array[high];


        int i = (low - 1);

        int j = low;
        while (j <= high - 1) {

            try {
                if (array[j] >= CenterPoint) {
                } else {
                    i++;
                    swap(array, i, j);
                }
                j++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        swap(array, i + 1, high);
        return (i + 1);
    }


    static void QuickSort(int[] array, int low, int high)
    {
        if (low < high)
        {
            int pi = Change(array, low, high);

            QuickSort(array, low, pi - 1);
            QuickSort(array, pi + 1, high);
        }
    }


    static void printarrayay(int[] array, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(array[i] + " ");

        System.out.println();
    }


    public static void main(String[] args)
    {
        try {
            int[] array = { 2342,34,53,453,42,34,564,7,657,456,35,23,42,544,34 };
            int n = array.length;

            QuickSort(array, 0, n - 1);
            System.out.println("The sorted array is: ");
            printarrayay(array, n);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

