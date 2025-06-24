import java.util.*;

public class reeverseastring {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        System.out.println("I am the Input " + Arrays.toString(s));
        int i = 0;
        int j = s.length-1;
        char temp = s[i];
        while ( i < j){
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;

        }
    }


}