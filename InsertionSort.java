public class InsertionSort {
//The best case input is an array that is already sorted. In this case insertion sort has a linear running time (i.e., Θ(n)).
// During each iteration, the first remaining element of the input is only compared with the right-most element of the sorted subsection of the array.
// The simplest worst case input is an array sorted in reverse order.
// The set of all worst case inputs consists of all arrays where each element is the smallest or second-smallest of the elements before it.
// In these cases every iteration of the inner loop will scan and shift the entire sorted subsection of the array before inserting the next element.
// This gives insertion sort a quadratic running time (i.e., O(n2)).
// The average case is also quadratic, which makes insertion sort impractical for sorting large arrays.
// However, insertion sort is one of the fastest algorithms for sorting very small arrays, even faster than quicksort;
// indeed, good quicksort implementations use insertion sort for arrays smaller than a certain threshold, also when arising as subproblems;
// the exact threshold must be determined experimentally and depends on the machine, but is commonly around ten.
    public static void main(String a[]){
        int[] arr1 = {10,34,2,56,7,67,88,42};
      //  doInsertionSort(arr1);
        doInsertionSort(arr1,arr1.length);
        for(int i:arr1){
            System.out.print(i);
            System.out.print(", ");
        }
    }

    public static void doInsertionSort(int[] input){

        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
    }

    public static void doInsertionSort(int[] arr, int n) {

        // Base case
        if (n <= 1)
            return;

        // Sort first n-1 elements
        doInsertionSort( arr, n-1 );

        // Insert last element at its correct position
        // in sorted array.
        int last = arr[n-1];
        int j = n-2;

        /* Move elements of arr[0..i-1], that are
          greater than key, to one position ahead
          of their current position */
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
}
