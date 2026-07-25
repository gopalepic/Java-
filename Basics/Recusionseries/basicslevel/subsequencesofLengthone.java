package Basics.Recusionseries.basicslevel;

public class subsequencesofLengthone {
    public static void main(String[] args) {

        String s = "ABC";
        // len 1 ka he print krna hai
        recursiveFn(s, 0);

    }

    public static void recursiveFn(String s, int i) {
        if (i == s.length()) {
            return;
        }

        System.out.println(s.charAt(i));
        recursiveFn(s, i + 1);

    }
}
