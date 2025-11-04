package Contest.Contensts.Con473;
import java.util.ArrayList;
// ...existing code...
  public class Q1 {
  
    public static long removeZeros(long n) {
        if (n == 0) return 0L;

        long sign = n < 0 ? -1L : 1L;
        long x = Math.abs(n);

        long rev = 0L;
        while (x != 0) {
            int d = (int)(x % 10);
            if (d != 0) rev = rev * 10 + d;
            x /= 10;
        }

        long ans = 0L;
        while (rev != 0) {
            ans = ans * 10 + (rev % 10);
            rev /= 10;
        }

        return sign * ans;
    

    }


     public static long removeZeros1(long n){

 ArrayList<Long> list = new ArrayList<>();

     while(n!= 0){
        long  lastdigit = n%10; 

        if(lastdigit== 0){

        }else{
            list.add(lastdigit);
        }
        n=n/10;
     }
      list.reversed();
  long sum = 0 ;
  long nlen = list.size();
      for(int i = 0 ; i<nlen ; i++){
       sum += 10*(nlen-i)*list.get(i);
      }
      return sum ;
     }

     public static void main(String[] args) {
        
     }

  }
