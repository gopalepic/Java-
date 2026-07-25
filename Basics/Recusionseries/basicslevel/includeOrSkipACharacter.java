package Basics.Recusionseries.basicslevel;

public class includeOrSkipACharacter {
    public static void main(String[] args) {

        String s = "A";
        recursiveFn(s, 0, "");
    }

    public static void recursiveFn(String s, int i, String s2) {

        if (i == s.length()) {

            System.out.println("END : " + s2 + " Curr is " + s2);
            return;
        }

        System.out.println("CURR IS " + s2);
        char c = s.charAt(i);

        
        recursiveFn(s, i + 1, s2+c);

        
        recursiveFn(s, i+1, s2);

    }
}
