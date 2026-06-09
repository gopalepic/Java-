package code.leetcodeproblems;

import java.util.Arrays;

public class defusetheBomb {
    public static void main(String[] args) {
        int[] code = { 5, 7, 1, 4 };
        int k = -2;
        decrypt(code, k);
    }

    public static int[] decrypt(int[] code, int k) {

        int[] decryptCode = new int[code.length];

        if (k > 0) {
            for (int i = 0; i < code.length; i++) {

                int j = i + 1;
                int cnt = 0;
                int sum = 0;
                while (cnt < k) {
                    sum += code[j % code.length];
                    j++;
                    cnt++;
                }

                decryptCode[i] = sum;
            }

        } else if (k < 0) {
            for (int i = 0; i < code.length; i++) {

                int j = i - 1;
                System.out.println("J :::" +j );
                int cnt = 0;
                int sum = 0;
                while (cnt > k) {
                    
                    sum += code[(j%code.length + code.length)%code.length];
                    j--;
                    cnt--;
                }

                decryptCode[i] = sum;
            }
        }
        else{
            
        }

        return decryptCode;

    }
}
