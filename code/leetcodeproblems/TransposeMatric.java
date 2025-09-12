package code.leetcodeproblems;

import java.util.Arrays;

public class TransposeMatric {
    public static void main(String[] args) {

        int[][] matric = {{1,2,3},{4,5,6}};
        // transpose(matric);
        int[][] result = transpose(matric);
        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] transpose(int[][] matrix) {

        int lengthofRoWS = matrix.length;
        int lengthofColumns = matrix[0].length;

        int[][] newMatrix = new int[lengthofColumns][lengthofRoWS];

        System.out.println("MATRIX LENGTH column " + matrix[0].length);

        for (int i = 0; i < lengthofColumns; i++) {
            for (int j = 0; j < lengthofRoWS; j++) {

                newMatrix[i][j] = matrix[j][i];
            }
        }

        return newMatrix;

    }
}