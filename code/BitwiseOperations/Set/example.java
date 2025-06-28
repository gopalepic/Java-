package code.BitwiseOperations.Set;

public class example {
    public static void main(String[] args) {
        int position =1;
        int number = 5;
        int bitmask = 1<<position;

       int newnumber = bitmask | number;
       System.out.println("Here is my newnumber " + newnumber);
    }
}
