package Basics.Recusionseries.basicslevel;

public class subsequencesOflengthK {
    public static void main(String[] args) {

        String s = "ABC";
        recursiveFn(s, 0, "", 2, 0);

    }

    public static void recursiveFn(String s, int i, String s2, int k, int j) {

        if (i == k) {

            System.out.println("END : " + " Curr is " + s2);
            return;
        }
        if (j == k) {
            System.out.println("SUBSEQUENCES :  " + s2);
            return;
        }

        System.out.println("CURR IS " + s2);
        char c = s.charAt(i);

        recursiveFn(s, i , s2 + c, k, j+1);

        recursiveFn(s, i + 1, s2, k, j);

    }
}
