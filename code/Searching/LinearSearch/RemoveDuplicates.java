package code.Searching.LinearSearch;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,1,5,3};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i = 1 ; i<nums.length  ; i++){
        
         if(nums[i] != nums[j]){
          j++;
          nums[j] = nums[i];
         }
        }
 
        return j ;
     } 
        
    
}
