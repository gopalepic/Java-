package code.Recursion;

public class sumofnnaturalnumbers {
    public static void main(String[] args) {
        int n = 3;
        Naturalnumbers(n);
    }

    public static int Naturalnumbers(int n ){
        int sum = 0;
        if(n>0){
         sum = n + Naturalnumbers(n-1);
         System.out.println("Sum " + sum);
         

        }
        return sum;
      
    }
}
