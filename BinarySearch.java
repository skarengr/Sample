import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args){
        //              0  1  2  3  4   5   6  7   8   9   10   11  12  13  14  15  16  17  18  19  20  21  22  23  24
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        Scanner s =new Scanner(System.in);
        System.out.println("Enter value to find in prime array");
        int value=0;
        try {
            value = s.nextInt();

        }catch (Exception e){
            throw  e ;
        }
        s.close();
        System.out.println("Index to find in array using binary search  " + binarySearch(primes,value));
    }


    static int binarySearch(int[] sortedArray,int valueToFind){
        int startIndex=0;
        int endIndex=sortedArray.length-1;
        while(startIndex<=endIndex){
            int midIndex =startIndex+(endIndex-startIndex)/2;
            if(valueToFind < sortedArray[midIndex])
                endIndex=midIndex-1;
            else if(valueToFind > sortedArray[midIndex])
                startIndex=midIndex+1;
            else
                return midIndex;
        }
        return -1;
    }
}
