package code.BasicMath;

public class AddDigits {
    public static void main(String[] args) {
        
        int num = 38 ; 
        System.out.println(addDigits(num));
    }

    public static int addDigits(int num) {
         int temp = 0 ; 
        while(num>9 ){
           int last = num%10 ; 
            while(num > 0){
               temp += last ;
               num = num/10;
               last = num%10;
            }
            num = temp ;
            temp = 0 ;
        }
        return num;
    }
}
