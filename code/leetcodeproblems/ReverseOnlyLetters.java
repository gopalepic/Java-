

import java.util.Arrays;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "Test1ng-Leet=code-Q!";
        reverseOnlyLetters(s);
    }

    public static String reverseOnlyLetters(String s) {
        int i = 0 ; 
        int j = s.length() -1 ;


        char[] resultString = s.toCharArray();

        while (i<=j) {
            if(Character.isAlphabetic(s.charAt(i)) && Character.isAlphabetic(s.charAt(j))){
                Character temp = s.charAt(i);
                resultString[i] = s.charAt(j);
                resultString[j] = temp;
                i++;
                j--;
            }
            else if (!Character.isAlphabetic(s.charAt(i))){
               resultString[i] = s.charAt(i);
               i++;
            }
            else if(!Character.isAlphabetic(s.charAt(j))){
                resultString[j] = s.charAt(j);
                j--;
            }
        }
        System.out.println(resultString);

         return new String(resultString);
    }

    
}
