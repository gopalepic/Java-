package Contest.Contensts.Contest468;

public class FirstQuestion {
    public static void main(String[] args){

        int[] nums = {1,8,16};
        int ans =  evenNumberBitwiseORs(nums);
        System.out.println(ans);
    }

    public static int evenNumberBitwiseORs(int[] nums) {
        
        int sum = 0 ;
        for(int i =  0 ; i<nums.length; i++){
            if(nums[i]%2 == 0 ){
                int result = sum | nums[i];
                 sum = result;
            }
        }
        return sum ;
    }
}
