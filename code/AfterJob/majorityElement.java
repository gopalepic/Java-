package code.AfterJob;

public class majorityElement {
    public static void main(String[] args) {
 
        int[] arr = {2,2,2,2,1,1,1,1,1,2,2};
       System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {

        int cnt = 0 ; 
        int element = 0 ; 

        for (int i = 0 ; i <nums.length ; i++){

            if(cnt == 0 ){
                element = nums[i];
                cnt = 1 ; 
            }else if(element != nums[i]){
                cnt -- ;
            }
            else{
                cnt++;
            }
        }

        return element;

        
    }
}
