package code.AfterJob;

import java.util.Arrays;

public class RotateImage {

    public static void main(String[] args) {

        int[][] arr = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
        rotate(arr);
    }

    public static void rotate(int[][] matrix) {

        // first you should come up with the transpose of the matrix

        for (int i = 0; i < matrix[0].length; i++) {

            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
            System.out.println();
        }

        for (int i = 0; i < matrix[0].length; i++) {
            int l = 0;
            int r = matrix[0].length - 1;
            while (l <= r) {
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }

        System.out.println("90 degree roated " + Arrays.deepToString(matrix));

    }

}
