package code.Recursion;

public class printnumber {
    public static void main(String[] args) {
        int num = 5;
         printnums(num);
    }

    public static void printnums(int num){
       
        if(num != 0){
            System.out.println(" I am original num " + num);
            printnums(num-1);
        
    }
}
}