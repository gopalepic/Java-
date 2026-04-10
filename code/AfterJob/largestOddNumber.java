package code.AfterJob;

public class largestOddNumber {
    public static void main(String[] args) {
        String num = "4206";
        largestOddNumber(num);
    }

     public static String largestOddNumber(String num) {
         
        for(int i = num.length() - 1 ; i>= 0 ; i--){
          
           if((num.charAt(i)-'0' & 1) == 1  ){
                return num.substring(0, i+1);
           }
        }
        return  " ";
    }
}
