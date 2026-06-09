package code.AfterJob;

public class LowerBound {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 7, 10, 11, 11, 25 };

        int x = 100;
        // output - index of a number in the array which is <= nums[i];
        int output = output(arr, x);
        System.out.println(output);

    }

    // using linear search ---- -- --
    // public static int output(int[] arr, int target) {

    // for (int i = 0; i < arr.length; i++) {

    // if (arr[i] > target) {
    // return i;
    // }
    // if (arr[i] == target) {
    // return i;
    // }

    // }
    // return arr.length;

    // }

    public static int output(int[] arr, int x) {

        int ans = arr.length ;
        int start = 0;
        int end = ans - 1;
        boolean start = false;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] >= x){  

                
            }else{
                start = mid + 1;
            }
            
          
        }
        return ans;
    }
}
