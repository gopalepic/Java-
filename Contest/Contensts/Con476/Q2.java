package Contest.Contensts.Con476;

public class Q2 {
    public static void main(String[] args) {
        String s = "aabbab";
        int res = minLengthAfterRemovals(null);
        System.out.println(res);
    }

     public static int minLengthAfterRemovals(String s) {
        int[] freq= new int[2];
        for(int i = 0 ; i <s.length() ; i++){
          freq[ s.charAt(i)-'a']++ ;  
        }

    }
}
