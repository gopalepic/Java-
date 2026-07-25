package Basics.Recusionseries.basicslevel;

public class printprefixes {
    public static void main(String[] args) {

        String s = "CODE";
        recursiveFn(s, 0, s.length(), "");
    }

    public static void recursiveFn(String s, int i, int n, String curr) {

        if (i == n) {
            return;
        }
        curr = curr + s.charAt(i);
        System.out.println(curr);
        recursiveFn(s, i+1, n, curr);

    }

}
