package code.BitwiseOperations.Get;

public class example {
    public static void main(String[] args) {
        int n = 5 ;
        int position = 2;
        int bitmask = 1 << position;
        if((bitmask & n) == 0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }
}
