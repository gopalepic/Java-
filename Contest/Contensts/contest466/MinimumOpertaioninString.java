package Contest.Contensts.contest466;

public class MinimumOpertaioninString {
    public static void main(String[] args) {

        String s = "yz";

        // int value = minOperations(s);
        // System.out.println(value);
        minOperations(s);
    }

    public static void minOperations(String s) {
        StringBuilder string = new StringBuilder();
        s.toLowerCase();
        
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            char c = s.charAt(i);
            int j = (int) c;
            while (c != 'a') {
                System.out.println("I am the Character " + c);
               count ++;
                if (j > 121) {
                    j = j - 26;
                }

                j++;
                c = (char)j;
                
                System.out.println("I am J " + j);
            }
            string.append(c);
        }
          System.out.println("END PRODUCT " + string);
        System.out.println("COUNT " + count);

    }

}
