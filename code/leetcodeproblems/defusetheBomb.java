package leetcodeproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class defusetheBomb {
    public static void main(String[] args) {
        int[] code = { 5, 7, 1, 4 };
        int k = 3;
        decrypt(code, k);
    }

    public static void decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        ArrayList<Integer> arr = new ArrayList<>();
        // if(k == 0){
        // return new int[] {0};
        // }

        for (int i = 0; i < code.length; i++) {


            int sum = 0;
            if (k > 0) {
                for (int j = 1; j < k; j++) {

                    sum += code[(i + j) % code.length];
                }
                result[i] = sum;
            }
            else if (k<0){
                
            }
        }

    }
}
