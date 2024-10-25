package code.Recursion;

public class StringPalindrome {
    public static void main(String[] args) {
        boolean result = isPalindrome("A man, a plan, a canal: ##Panama");
        
        System.out.println(result);
    }

    public static boolean isPalindrome(String s){
        StringBuilder filteredString = new StringBuilder();
        for(int i = 0 ; i<s.length();i++){
            
            if(Character.isLetterOrDigit(s.charAt(i))){
                filteredString.append(s.charAt(i));
                
            }
            
        }
        boolean result = palindrom(filteredString.toString().toLowerCase(), 0);
        return result;
        
    }

    public static boolean palindrom(String s , int i ){
            if(i>=s.length()/2) return true;
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
            return palindrom(s, i+1);

    }

}
