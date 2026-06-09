package Contest.Contensts.Con473;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q3 {

    public static void main(String[] args) {
        
        int[] arr = {9,3,3,3,9};
        long  ans =  countStableSubarrays(arr);
        System.out.println(ans);
    }

    //   public static long countStableSubarrays(int[] capacity) {
    //   int n = capacity.length;
    //     long[] pref = new long[n + 1];
    //     for (int i = 0; i < n; i++) pref[i + 1] = pref[i] + capacity[i];

    //     Map<Integer, List<Integer>> posMap = new HashMap<>();
    //     for (int i = 0; i < n; i++) {
    //         posMap.computeIfAbsent(capacity[i], k -> new ArrayList<>()).add(i);
    //     }

    //     long ans = 0;
    //     for (Map.Entry<Integer, List<Integer>> e : posMap.entrySet()) {
    //         int v = e.getKey();
    //         List<Integer> list = e.getValue();
    //         Map<Long, Integer> freq = new HashMap<>();
    //         int p = 0; 
    //         for (int jIdx = 0; jIdx < list.size(); jIdx++) {
    //             int j = list.get(jIdx);
    //             // add prior indices i whose i <= j-2
    //             while (p < jIdx && list.get(p) <= j - 2) {
    //                 long keyToAdd = pref[list.get(p) + 1]; 
    //                 freq.put(keyToAdd, freq.getOrDefault(keyToAdd, 0) + 1);
    //                 p++;
    //             }
    //             long target = pref[j] - (long) v; 
    //             ans += freq.getOrDefault(target, 0);
    //         }
    //     }
    //     return ans;
          
    // }

    
      public static long countStableSubarrays(int[] capacity) {
      
        int n = capacity.length ; 

        long[] pref = new long[n+1];

        for(int i = 0 ;i<n ; i++){
            pref[i+1] = pref[i]+capacity[i];
        }
        System.out.println(Arrays.toString(pref));
       
        return 0;
          
    }

   
    
    
}
