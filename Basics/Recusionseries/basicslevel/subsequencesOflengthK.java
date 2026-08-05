package Basics.Recusionseries.basicslevel;

public class subsequencesOflengthK {
    public static void main(String[] args) {

        String s = "ABCD";
        recursiveFn(s, "", 2, 0);

    }

    public static void recursiveFn(String s, String curr, int k, int j) {

        if (curr.length() == k) {
            System.out.println("Curr " + curr);
            return;
        }

        if (j == s.length()) {
            return;
        }

        char c = s.charAt(j);

        recursiveFn(s, curr + c, k, j + 1);

        recursiveFn(s, curr, k, j + 1);
    }
}
