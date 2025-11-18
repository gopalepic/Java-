import java.util.ArrayList;
public class LetterCombinationsOfaPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        ArrayList<String> ans = letterCombinations(digits);
        System.out.println(ans);
    }

    public static ArrayList<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<>();


    String[] map = {
        "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };

    ArrayList<String> res = new ArrayList<>();    
    backtrack("",digits,0,map,res);
    return res ;
    }

    private static void   backtrack(String current , String digits , int index , String[] map ,ArrayList<String> res){

     if(index == digits.length()){
        System.out.println(current);
        res.add(current);
        return ; 
     }

     String letters = map[digits.charAt(index) - '2'];
     for(char c : letters.toCharArray()){
        backtrack(current + c , digits, index+1 , map , res);
     }
    }

    
    
}
