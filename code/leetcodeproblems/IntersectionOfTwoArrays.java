import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
                
        intersection(nums1,nums2);

    }
// Wrost Way
    // public static int[] intersection(int[] nums1, int[] nums2) {
        
    //     ArrayList<Integer> arraylist = new ArrayList<>();
    //     HashSet <Integer> Set = new HashSet<>(arraylist);
    //     int size1 = nums1.length;
    //     int size2 = nums2.length;
       
    //     if (size1>size2){
    //          for(int i = 0 ; i < size1 ; i++){
    //             for(int j = 0 ; j<size2 ; j++){
    //                 if(nums1[i] == nums2[j]){
    //                   arraylist.add(nums2[j]);
    //                 }
    //             }
    //          }
    //     }
    //     else{
    //          for(int j = 0 ; j < size2 ; j++){
    //             for(int i = 0 ; i<size1 ; i++){
    //                 if(nums2[j] == nums1[i]){
    //                    arraylist.add(nums1[i]);
    //                 }
    //             }
    //          }
    //     }

    //  Set = new HashSet<>(arraylist);
    //  int[] result = new int[Set.size()];
    //  int index = 0;
    //  for( int num: Set){
    //     result[index++] = num;
    //  }
     
    //  return result;
    // }

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet <Integer> Set = new HashSet<>();
        HashSet <Integer> Set2 = new HashSet<>();

        for(int num : nums1){
             Set.add(num);
        }

        

        for (int i = 0 ; i<nums2.length; i++){
            if(Set.contains(nums2[i])){
                Set2.add(nums2[i]);
            }
        }
         int[] result = new int[Set2.size()];
         int index = 0 ;
        for (int num : Set2){
            result[index++] = num;
        }
        

        return result;
    }
}
