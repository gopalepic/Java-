package code.Recursion;

public class Sumofdigits {
    public static void main(String[] args) {
        
        int N = 1234 ;
        int ans = sum(N);
        System.out.println(ans); 


    }

    public static int sum(int n ){
        if ( n>0){
         int last = n%10; 
         return last+sum(n/10);

        }
        else{
            return 0;
        }
    }
}
