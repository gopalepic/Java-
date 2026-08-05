package Basics.Recusionseries.basicslevel;

public class subsequencesHavingEvenLength {
    public static void main(String[] args) {

        String s = "ABCD";
        recursiveFn(s, 0, "");

    }

    public static void recursiveFn(String s, int i, String s2) {

        if (i == s.length()) {

            // System.out.println("FINAL : " + s2);
            if (s2.length() % 2 == 0 ) {
                System.out.println("EVEN " + s2);
            }

            return;
        }

        char c = s.charAt(i);

        recursiveFn(s, i + 1, s2 + c);

        recursiveFn(s, i + 1, s2);

    }
}
