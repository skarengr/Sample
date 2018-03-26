import java.util.Arrays;

public class SelectionSort {

    // Return minimum index
    static int minIndex(int a[], int i, int j)
    {
        //int arr[] = {-3, 1, 0, 2, 7, 0,0,5};
        if (i == j)
            return i;

        // Find minimum of remaining elements
        int k = minIndex(a, i + 1, j);

        System.out.println("minIndex   "+a[i] +"  "+a[k]);
        // Return minimum of current and remaining.
        if(a[i] < a[k]){
            System.out.println("if minIndex i value  "+i +" minIndex k value   "+k);
        }else{
            System.out.println("else minIndex i value     "+i +" minIndex k value   "+k);
        }
        return (a[i] < a[k])? i : k;
    }

    // Recursive selection sort. n is size of a[] and index
    // is index of starting element.
    static void recurSelectionSort(int a[], int n, int index)
    {

        // Return when starting and size are same
        if (index == n)
            return;
        //System.out.println(index +"  "+(n-1));
        // calling minimum index function for minimum index
        int k = minIndex(a, index, n-1);
        System.out.println("minIndex k value   "+k);
        // Swapping when index nd minimum index are not same
        if (k != index){
            // swap
            int temp = a[k];
            a[k] = a[index];
            a[index] = temp;
        }
        // Recursively calling selection sort function
        recurSelectionSort(a, n, index + 1);
    }


    // Driver method
    public static void main(String args[])
    {
        int arr[] = {-3, 1, 0, 2, 7, 0,0,5};

        // Calling function
       // recurSelectionSort(arr, arr.length, 0);
        recurSelectionSort(arr);

        //printing sorted array
        for (int item:arr)
            System.out.print(item + " ");
    }


    static void recurSelectionSort(int[] arr){
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

}
