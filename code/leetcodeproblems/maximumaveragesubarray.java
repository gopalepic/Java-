public class maximumaveragesubarray {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        double output = findMaxAverage(nums,4);
        System.out.println(output);
    }

    public static double findMaxAverage(int[] nums, int k) {
     
        int windowSum = 0;
        for(int i = 0 ; i < k ; i++){
              windowSum += nums[i];
        }

        int Maxsum = windowSum;

        for(int i = k ; i < nums.length ; i++){
             windowSum = windowSum - nums[i-k] + nums[i] ;

             if(windowSum > Maxsum){
                Maxsum = windowSum;
             }
        }
      return (double) Maxsum/k;
}
}
