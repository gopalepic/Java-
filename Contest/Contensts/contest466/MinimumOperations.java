package Contest.Contensts.contest466;

public class MinimumOperations {
    public static void main(String[] args) {
        
        int[] nums={1,3,2,5};
        int value = minOperations(nums);
        System.out.println(value);
    }

     public static int minOperations(int[] nums) {

        int operations = 1 ;
        int count = 0 ;
        for(int i = 0 ; i<nums.length-1  ; i ++){
            if(nums[i] == nums[i+1] ){
                count ++;
            }
        }
       
        if(count == nums.length - 1){
            operations = 0;
        }

        return operations;
    }
}
