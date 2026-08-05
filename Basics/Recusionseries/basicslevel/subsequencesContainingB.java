package Basics.Recusionseries.basicslevel;

public class subsequencesContainingB {
    public static void main(String[] args) {

        String s = "AB";
        // recursiveFn(s, 0, "", false); // second call

        recursiveFn(s, 0, ""); // first call

    }

    public static void recursiveFn(String s, int i, String s2) {

        if (i == s.length()) {

            if (s2.contains("B")) {
                System.out.println("FINAL : " + s2);

            }
            return;
        }

        char c = s.charAt(i);

        recursiveFn(s, i + 1, s2 + c);

        recursiveFn(s, i + 1, s2);

    }

    // public static void recursiveFn(String s, int i, String s2, boolean flag) {

    // if (i == s.length()) {

    // if (flag) {
    // System.out.println("FINAL " + s2);
    // }

    // return;
    // }

    // char c = s.charAt(i);
    // if (c == 'B') {
    // recursiveFn(s, i + 1, s2 + c, true);
    // } else {
    // recursiveFn(s, i + 1, s2 + c, false);
    // }

    // recursiveFn(s, i + 1, s2, flag);

    // }
}
