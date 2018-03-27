import java.util.Arrays;

public class FibonacciSeries {



    public static void main(String[] arg){
        int fibNumber =20;
        int[] fibMemo=new int[fibNumber+1];

        //new FibonacciSeries().fibByRecMemo(fibNumber,fibMemo);
        new FibonacciSeries().fib(fibNumber,fibMemo);

        System.out.println(Arrays.toString(fibMemo));
    }

     int fibByRecMemo(int num, int[] fibMemo){
        if(num == 0){
            fibMemo[0] = 0;
            return 0;
        }
        if(num ==1 || num ==2){
            fibMemo[num] = 1;
            return 1;
        }
        if(fibMemo[num] == 0){
            fibMemo[num] = fibByRecMemo(num-1,fibMemo) + fibByRecMemo(num -2,fibMemo);
            return fibMemo[num];
        }else{
            return fibMemo[num];
        }
    }

    public static int[] fib(int num,int[] fibSum) {
       // int fibSum[] = new int[num];
        for (int i = 0; i <=num; i++) {
            if (i == 0) {
                fibSum[i] = i;
                continue;
            }
            if (i == 1 || i == 2) {
                fibSum[i] = 1;
                continue;
            }
            fibSum[i] = fibSum[i - 1] + fibSum[i - 2];
        }
        return fibSum;
    }
}
