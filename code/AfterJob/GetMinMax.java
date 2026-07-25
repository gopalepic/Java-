package code.AfterJob;

import java.util.ArrayList;

public class GetMinMax {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 5, 8, 6 };
        getMinMax(arr);
    }

    public static ArrayList<Integer> getMinMax(int[] arr) {

        ArrayList<Integer> list = recursive(arr, 0, new ArrayList<>(), Integer.MAX_VALUE, Integer.MIN_VALUE);
        System.out.println(list);

        return list;

    }

    public static ArrayList<Integer> recursive(int[] arr, int i, ArrayList<Integer> list, int min, int max) {

        if (i < arr.length) {

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            i++;

            return recursive(arr, i, list, min, max);

        }
        list.add(0, min);
        list.add(1, max);

        return list;

    }
}
