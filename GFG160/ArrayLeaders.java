package GFG160;

import java.util.ArrayList;

public class ArrayLeaders {

    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] arr = { 16,17,4,3,5,2};
        ArrayList<Integer> list = sl.leaders(arr);
        System.out.println("LIST " + list);
    }
}

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        // elements where the j hand side elements are lower than they

        ArrayList<Integer> list = new ArrayList<>();

        int j = 1;
        for(int i = 0 ; i<arr.length-1 ; i++){
            
            if(arr[i]>arr[j]){
                list.add(arr[i]);
                
            }

            while()
            
        }
         list.add(arr[arr.length-1]);
        return list;

    }
}
