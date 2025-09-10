package code.Sorting.BubbleSort;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 12, 2 };

        // IN BUBBLE SORT , WE ARE JUST COMPARING TWO NUMBERS
        // WHOEVER IS GREATER , We push them right

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println("ARRAY AFTER EACH ITERATIONS " + Arrays.toString(arr));
                }
            }
        }

    }
}
