package code.Recursion;

public class ReverseNum {
    public static void main(String[] args) {
        int n =19223;
        int ans = reverse(n);
        System.out.println(ans);
    }
    public static int reverse(int n ){
      
        int digits = (int)Math.log10(n) + 1 ;
        return helper(digits, n);
    }

    public static int helper(int digits,int n){
        if(n%10 ==n){
            return n ; 
        }
        int last = n%10 ; 
        return last*(int)Math.pow(10,digits)+ helper(digits-1, n/10);
        

    }
}
