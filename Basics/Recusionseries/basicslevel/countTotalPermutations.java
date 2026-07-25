package Basics.Recusionseries.basicslevel;

public class countTotalPermutations {
    public static void main(String[] args) {
        int out = recursiveFn("abc", 0, "");

        System.out.println(out);
    }

    public static int recursiveFn(String s, int i, String s2) {

        if (i == s.length()) {

            System.out.println("END : " + s2 + " Curr is " + s2 + "COUNT ");
            return 1;
        }

        System.out.println("CURR IS " + s2);
        char c = s.charAt(i);

        return recursiveFn(s, i + 1, s2 + c) + recursiveFn(s, i + 1, s2);

    }

}
