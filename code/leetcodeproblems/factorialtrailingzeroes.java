public class factorialtrailingzeroes {
    public static void main(String[] args) {
    }

                              
    public static int trailingZeroes(int n) {

      
        int count = 0;
        while (n >= 5) {
            n /= 5;          // divide n by 5
            count += n;      // add the result to count
        }
        return count;

        
    }

}
