package Contest.Contensts.Con472;
import java.util.HashMap;
class Q2 {


    public static int longestBalanced(int[] nums) {
        int maxLen = 0;
        int len = nums.length ; 

        for (int i = 0; i < len; i++) {
            HashMap<Integer,Integer> map = new HashMap<>();
            
            int cntOdd = 0;
            int cntEven = 0;
            for(int j = i ; j<len; j++){

                if(!map.containsKey(nums[j])){
                    if(nums[j]%2==0){
                        cntEven++;
                    }else{
                        cntOdd++;
                    }
                    map.put(nums[j], 0);
                }

                if(cntEven==cntOdd){
                   maxLen = Math.max(j-i+1 , maxLen);
                }
            }
        }

        return maxLen;
    }


  
    

    public static void main(String[] args) {
        int[] nums = {1,2,3,2 };
        int ans = longestBalanced(nums);
        System.out.println("ANS " + ans);
    }
}