package code.leetcodeproblems;

public class powerOfX {

    public static double myPow(double x, int n) {
        
        double ans = 1 ; 

        long pow = n;


        if(pow<0){
             x = 1/x;
             pow=pow*(-1);
        }

        while(pow > 0 ){

            if(pow%2 == 0 ){
                x *= x ; 
                pow = n/2 ; 
            }else{
                ans *= x;
                pow--; 
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(myPow(16, 2));
    }
}
