package code.leetcodeproblems;

public class reverseInteger {
    public static void main(String[] args) {
        int val = 1234;
        System.out.println(reverse(val));

    }

    public static int reverse(int x) {
        // first sign , // size using string

        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
        }
        

        int val = Math.abs(x);
        int ans = 0;
        while ( val> 0 ) {
            int last = val % 10;
            if(ans > Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10){
                return 0 ; 
            }
            ans = ans*10 + last ;
            val/=10;
        }

        
        return (isNegative ? -1*ans : ans);

    }
}
