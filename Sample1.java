import java.util.Arrays;

public class Sample1 {
    static long noOfComparisons;
    public static void main(String[] arg){
        //String s[]={"4", "9", "4", "4", "1", "9", "6", "4", "-9", "4", "-4", "1", "4"};
        int ar[]={4, 9, 4, 4, 1, 9, 6, 4, -9, 4, -4, 1, 4};
        //int ar[]={1,242,23,456,56,34,323};
        //Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        QuickSort(ar,0,ar.length-1);
        printValues(ar);

    }
    private static void QuickSort(int[] a, int left, int right)
    {

        int pivot;
        if (right > left)
        {
            pivot = Partition(a, left, right);
            //System.out.println("pivot     "+pivot+"  left     "+left+"  right     "+right);
            QuickSort(a, left, pivot-1);
            QuickSort(a, pivot+1, right);
        }

    }


    private static int Partition(int[] a, int left, int right)
    {

        // swap median and first before getting started
        int median = findMedianOf3(a, left, right);
        //Swap(a, left, median);

        int p = a[left];
        int i = left+1;

        for (int j = left+1; j <= right; j++)
        {
            if (a[j] < p)
            {
                Swap(a, j, i);
                i++;
            }
        }

        Swap(a, left, i-1);
        return (i-1);

    }


    private static void Swap(int[] a, int i, int j)
    {
        if(a[i]!=a[j]){
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            printValues(a);
        }
    }


    private static int findMedianOf3(int[] array, int leftIndex, int rightIndex) {

        int t,medianIndex = (int)Math.floor((leftIndex + rightIndex)/2);

        // ensure correct order of values
        if (array[rightIndex] < array[leftIndex])
        {
            t = leftIndex;
            leftIndex = rightIndex;
            rightIndex = t;
        }

        if (array[medianIndex] > array[rightIndex])	medianIndex = rightIndex;
        else if (array[medianIndex] < array[leftIndex])	medianIndex = leftIndex;

        System.out.println("medianIndex     "+medianIndex);
        return medianIndex;
    }

    private static void printValues(int[] n){
        System.out.println(Arrays.toString(n));
    }
}
