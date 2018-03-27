import java.util.ArrayList;

public class ArrayListProgram {

    ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
    }

    public static void main(String[] arg){
        ArrayList<ArrayList<Integer>> hj =new ArrayList<ArrayList<Integer>> (){1, 2, 3, 4}, {5, 7, 6, 8},{9, 10, 11, 12}};
        ArrayList<ArrayList<Integer>> B = new ArrayListProgram().performOps(hj);
        for (int i = 0; i < B.size(); i++) {
            for (int j = 0; j < B.get(i).size(); j++) {
                System.out.print(B.get(i).get(j) + " ");
            }
        }
    }
}
