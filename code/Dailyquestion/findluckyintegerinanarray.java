package Dailyquestion;

import java.util.HashMap;

public class findluckyintegerinanarray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 3, 3, 3 };
       System.out.println(findLucky(arr)) ;
    }

    public static int findLucky(int[] arr) {

        int result = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()){
            if(key == map.get(key)){
                result = Math.max(result, key);
            }
        }

return result;    }
}
