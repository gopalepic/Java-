package code.Dailyquestion;

import java.util.Arrays;
import java.util.HashMap;

public class DeleteCharacterstoMakeFancyString {
    public static void main(String[] args) {
        String s = "aaaaabc";
        makeFancyString(s);
    }

    public static void makeFancyString(String s) {

        char[] sb = new char[s.length()];

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int j = i;
            while (s.charAt(i) == s.charAt(j)) {
                 count +=1;
                 j++;
               
            }
            j = count;
            if(count>2){
                sb[i] = s.charAt(i);
                sb[i+1] = s.charAt(i);
            }
            
            sb[i] = s.charAt(i);
            System.out.println(Arrays.toString(sb));

        }

    }

}
