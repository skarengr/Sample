import java.lang.reflect.Array;
import java.util.Arrays;

public class Sample {


    public static void main(String[] arg){
        //Invoking GCD method
        //System.out.println("Greatest common Divisor is "+gcd(12, 45));
        Sample s =new Sample();
        long startTime = System.currentTimeMillis();
        //int ar[]={1,242,23,456,56,34,323,4534,45,23};
        int ar[]={4, 9, 4, 4, 1, 9, 4, 4, -9, 4, -4, 1, 4};;

        //Arrays.sort(ar);
        s.quickSort(ar,0,ar.length-1);
        printValues(ar);
        long stopTime = System.currentTimeMillis();

        System.out.println("Time  "+(stopTime-startTime));

        /*Node n1 =createNode(12);
        Node n2 =createNode(35);
        n1.next=n2;
        Node n3=createNode(45);
        n2.next=n3;

        printValues(n1);*/
    }

    //Greatest common Divisor
    //value p=12  1,2,3,4,6,12
    //value q=45  1,3,5,9,15,45
    //return 3
    private static int gcd(int p, int q){
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    private static Node createNode(int value){
        Node n =new Node();
        n.value=value;
        return n;
    }

    private static void printValues(Node n){
        while(n!=null){
            System.out.println(n.value);
            n=n.next;
        }
    }

    private static void printValues(int[] n){
//        for(int i=0;i<n.length;i++){
//            System.out.println(n[i]);
//        }
        System.out.println(Arrays.toString(n));
    }

    /* This QuickSort requires O(Log n) auxiliary space in
   worst case. */
    void quickSort1(int arr[], int low, int high)
    {
        //System.out.println(low +"  "+high);
        while (low < high)
        {
        /* pi is partitioning index, arr[p] is now
           at right place */
            int pi = partition(arr, low, high);

            // If left part is smaller, then recur for left
            // part and handle right part iteratively
            if (pi - low < high - pi)
            {
                quickSort(arr, low, pi - 1);
                low = pi + 1;
            }

            // Else recur for right part
            else
            {
                quickSort(arr, pi + 1, high);
                high = pi - 1;
            }
        }
    }

    void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
        /* pi is partitioning index, arr[p] is now
           at right place */
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }

    }

    int partition(int arr[], int low, int high)
    {

        int pivot = arr[high];
        int i = low; // index of smaller element

        for (int j=low; j<high; j++)
        {
            //System.out.println(i+"   "+low +"  "+high);
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                // swap arr[i] and arr[j]
                swap(arr, i ,j);
                i++;
            }
        }
        //System.out.println(i+"   "+low +"  "+high);
        // swap arr[i+1] and arr[high] (or pivot)
        swap(arr, i ,high);

        return i;
    }

    void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        printValues(arr);
    }
}


class Node{

    public Node next;
    public int value;
}
