import java.util.*;
public class ValidPalindrome {
    public static void main(String[] args) {

       String s = "A man, a plan, a canal: Panama";
       System.out.println(isPalindrome(s));
    }

      public static boolean isPalindrome(String s) {
        StringBuilder newString = new StringBuilder();
        s = s.toLowerCase();
        for(int i = 0 ; i<s.length();i++){
            
            if(!Character.isLetterOrDigit(s.charAt(i))){
                continue;
            }
            else{ newString.append(s.charAt(i));}
           
        }
        int i = 0 ;
        int j = newString.length() -1 ;
        while(i!=newString.length()){
            if(newString.charAt(i) == newString.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }

        System.out.println(newString);
        return true;
        
    }
}
