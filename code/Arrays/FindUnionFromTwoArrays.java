package code.Arrays;

import java.util.ArrayList;

public class FindUnionFromTwoArrays {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 2, 3, 4, 5, 6, 7 };
        System.out.println(findUnion(a, b));
    }

    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        ArrayList<Integer> CommonElement = new ArrayList<Integer>();

        int checkArrayList = -1;
        int i = 0;
        int j = 0;
        int n = a.length;
        int m = b.length;

        while (i < n && j < m) {
            if (a[i] == b[j]) {

                if ( !CommonElement.contains(a[i])) {
                    CommonElement.add(a[i]);
                    i++;
                    j++;
                } else {
                    i++;
                    j++;
                }
            }

            else if (a[i] < b[j]) {
                if ( !CommonElement.contains(a[i])) {
                    CommonElement.add(a[i]);
                    i++;
                } else {
                    i++;
                }

            } else if (a[i] > b[j]) {
                if (!CommonElement.contains(a[i])) {
                    CommonElement.add(a[j]);
                    j++;

                } else {
                    j++;
                }
            }

            while (i < n) {
                if (!CommonElement.contains(a[i])) {
                    CommonElement.add(a[i]);
                    i++;
                } else {
                    i++;
                }

            }

            while (j < m) {
                if (!CommonElement.contains(a[j])) {
                    CommonElement.add(b[j]);
                    j++;
                } else {
                    j++;
                }

            }

        }
        return CommonElement;

    }
}