package code.Dailyquestion;

import java.util.HashMap;
import java.util.HashSet;

public class MostFrequentVowelandConstant {

    public static void main(String[] args) {
        String s = "succaeioesses";
        int result =  maxFreqSum(s);
        System.out.println("RESULt " + result);
    }

    public static int maxFreqSum(String s) {

        HashMap<Character, Integer> Vowels = new HashMap<>();
        HashMap<Character, Integer> Consonats = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if(Vowels.containsKey(ch)){
                    Vowels.put(ch,Vowels.getOrDefault(ch,1)+1);
                } else {
                    Vowels.put(ch, 1);
                }
            }
             else {
               if (Consonats.containsKey(ch)) {
                    Consonats.put(ch,Consonats.getOrDefault(ch , 1) +1);
                } else {
                    Consonats.put(ch, 1);
                } 
        }
        }

        int maxValueInConsonants = 0;
        for(int val : Consonats.values()){
            if(val > maxValueInConsonants){
                maxValueInConsonants = val;
            }
        }

        // for(char c : Vowels.keySet()){
        //     System.out.println("VAlues in hashset are " + c);
        // }

        int maxValueInVowels = 0;
        for(int val : Vowels.values()){
            if(val> maxValueInVowels){
                maxValueInVowels = val;
            }
        }
        


        return  maxValueInConsonants+maxValueInVowels;
    
}

}
