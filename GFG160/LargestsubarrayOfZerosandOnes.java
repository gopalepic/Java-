package GFG160;

import java.util.HashMap;

public class LargestsubarrayOfZerosandOnes {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 0, 1, 1, 1, 0 };
        maxLen(arr);
    }

    public static int maxLen(int[] arr) {
        // Brute Force approach

        int ans = 0;
        int sum = 0 ;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {

            sum +=(arr[i] == 0 ) ? -1 :1 ;

            System.out.println(map);

            if(map.containsKey(sum)){
               ans = Math.max(ans , i-map.get(sum));
            }else{
                map.put(sum, i);
            }
            
            
        }
        return ans;
    }

}
