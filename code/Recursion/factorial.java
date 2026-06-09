package code.Recursion;

public class factorial {
    public static void main(String[] args){
         System.out.println(factorialOfaNumber(5));
    }

    public static int factorialOfaNumber (int num){
         
        if(num > 0){
            return num * factorialOfaNumber(num-1);
        }

        return 1;
    }
}
