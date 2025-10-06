package code.leetcodeproblems;

import java.util.Arrays;
import java.util.ArrayList;

public class SetMatricZeroes {

    public static void main(String[] args) {

        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        System.out.println("ORI MATRIC " + Arrays.deepToString(matrix));
        setZeroes(matrix);
    }

    // public static void setZeroes(int[][] matrix) {

    // ArrayList<int[]> zeroPositions = new ArrayList<>();

    // for(int i = 0 ; i<matrix.length ; i++){

    // for(int j = 0 ; j<matrix[i].length ; j++){

    // if(matrix[i][j] == 0 ){
    // zeroPositions.add(new int[]{i,j});
    // }
    // }
    // }

    // for(int[] position : zeroPositions){
    // int row = position[0];
    // int col = position[1];

    // for(int i = 0 ; i<matrix[row].length ; i++){
    // matrix[row][i] = 0;
    // }
    // for(int j = 0 ; j<matrix.length ; j++){
    // matrix[j][col]=0;
    // }
    // }

    // }

    public static void setZeroes(int[][] matrix) {
        int Minimum = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == 0) {
                    int k = 0;

                    // FOR chaning Columns
                    while (k < matrix.length ) {
                        if (matrix[k][j] != 0) {
                            matrix[k][j] = Minimum;
                            
                        }k++;
                    }

                    // For changing rows
                    k = 0;
                    while (k < matrix[i].length) {
                        if (matrix[i][k] != 0) {
                            matrix[i][k] = Minimum;
                           
                        }
                        k++;

                    }
                }
            }
        }

        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length ; j++){

                if(matrix[i][j] == Minimum){
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println("FINAL ANS " + Arrays.deepToString(matrix));
    }
}
