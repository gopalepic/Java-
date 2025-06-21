public class removeelement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int value = 2;
        System.out.println(removeElement(nums,value));
    }

     public static int removeElement(int[] nums, int val) {
        int k  = 0;
        int i = 0;
        int j = nums.length;

        while(i!= nums.length){
            if(val == nums[i]){
                if(nums[j] == val){
                    j--;
                }
                nums[i] = nums[j];
                nums[j] = val;
                k++;
            }
            k = nums.length - k;
        }
       return k;
        
    }
}
