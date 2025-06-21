import java.util.Arrays;

public class plusone {
    public static void main(String[] args) {
        int[] digits = {1,0,9};
        System.out.println(Arrays.toString(plusoneArray(digits)));
    }
     
     public static int[] plusoneArray(int[] digits) {
  
        for(int i = digits.length-1  ; i>0 ; i--){
            digits[i] += 1;
            if(digits[i] < 10) {return digits;}
            else{
                digits[i] = 0;
            }
        }
        int[] newarray = new int[digits.length + 1];
        newarray[0] =  1;
        
        return newarray;
    }
}
