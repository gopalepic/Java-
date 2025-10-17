package Contest.Contensts.Con471;

import java.util.HashMap;

public class Q2 {
    public static void main(String[] args) {
        String s = "ss";
        int ans = longestBalanced(s);
        System.out.println("ANS " + ans);
    }

//     public static int longestBalanced(String s) {

//         // BRUTE FORCE , I will look for each and every substring

//         int maxLen = 0;

//         for (int i = 0; i < s.length(); i++) {

//             HashMap<Character, Integer> map = new HashMap<>();
//             int j = i;
//             for (; j < s.length(); j++) {

//                 char c = s.charAt(j);

//                 map.put(c, map.getOrDefault(c, 1) + 1);
//                 boolean validstring = true;
//                 if(map.size() == 1 ){
//                     maxLen = Math.max(maxLen,j-i+1);
//                 }
//                 if (map.size() >= 2) {
//                     int val = -1;
//                     for (int num : map.values()) {
//                         if (val == -1) {
//                             val = num;
//                         } else if (val != num) {
//                             validstring = false;
//                             break;
//                         }
//                     }
//                     if (validstring) {
//                         maxLen = Math.max(maxLen, j - i + 1);
//                     }
//                 }
//             }
//         }
//         return maxLen;
//     }
// }


//  Go for optimal solution 

 public static int longestBalanced(String s) {

        // BRUTE FORCE , I will look for each and every substring

        
        
    }
}

