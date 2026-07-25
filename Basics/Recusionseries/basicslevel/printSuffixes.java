package Basics.Recusionseries.basicslevel;

public class printSuffixes {
    public static void main(String[] args) {

        String s = "CODE";
        recursiveFn(s, 0, s.length());

    }

    public static void recursiveFn(String s, int i, int n) {
        if (i == n) {
            return;
        }
        System.out.println(s.substring(i));
        recursiveFn(s, i + 1, n);
    }
}
