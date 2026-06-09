package code.AfterJob;

import java.util.Arrays;
import java.util.HashMap;

public class sortColors {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 2, 0, 1, 2 };
        sortColors(nums);
    }

    // public static void sortColors(int[] nums) {

    // HashMap <Integer,Integer> map = new HashMap<>();

    // for(int i = 0 ; i<nums.length ; i++){
    // if(map.containsKey(nums[i])){
    // map.put(nums[i], map.getOrDefault(nums[i],0)+1);
    // }else{
    // map.put(nums[i],1);
    // }
    // }

    // System.out.println(map + "map ");
    // int[] arr = {0,1,2};
    // int cnt = 0 ;
    // for(int i = 0 ; i<arr.length ; i++){
    // if(map.containsKey(arr[i])){
    // // find how many times the key is there
    // int value = map.get(arr[i]);
    // for(int j = 0 ; j<value ; j++){
    // nums[cnt++]=arr[i];
    // }
    // }
    // }
    // System.out.println(Arrays.toString(nums));

    // }

    public static void sortColors(int[] nums) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                count0++;
            }
            if (nums[i] == 1) {
                count1++;
            }
            if (nums[i] == 2) {
                count2++;
            }
        }

        int cnt = 0;

        for (int i = 0; i < count0; i++) {
             nums[cnt++] = 0;
        }
        for (int i = 0; i<count1 ; i++){
            nums[cnt++] = 1;
        }
        for(int i = 0 ; i<count2 ; i++){
            nums[cnt++] = 2;
        }

        System.out.println(Arrays.toString(nums));
    }

}
