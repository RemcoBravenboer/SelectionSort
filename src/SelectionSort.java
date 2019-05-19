import java.util.ArrayList;
import java.util.List;

class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array 
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array 
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


    private static final int[] NUMBERS_COUNT = {100000, 200000, 300000, 400000, 500000, 600000, 700000, 800000, 900000, 1000000};
    // Driver code to test above 
    public static void main(String args[])
    {
        System.out.println("Test results (numbers | time)\n");
        for (int i = 0; i < NUMBERS_COUNT.length; i++) {
            SelectionSort ob = new SelectionSort();
            int arr[] = GenerateNumber(NUMBERS_COUNT[i]);
            long startingTime = System.currentTimeMillis();
            ob.sort(arr);
            System.out.println(NUMBERS_COUNT[i] + " | " + (System.currentTimeMillis() - startingTime) + "ms");
        }
    }

    static int[] GenerateNumber(int numberCount) {
        int arr[] = new int[numberCount];
        for (int i = numberCount; i > 0; i--) {
            arr[(i-1)] = i;
        }
        return arr;
    }
}