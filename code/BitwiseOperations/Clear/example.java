package code.BitwiseOperations.Clear;

public class example {
    public static void main(String[] args) {
        int position = 2;
        int number = 5;
        int bitmask = 1<<position;
        int firstOP = ~bitmask;

        int secondOP = firstOP & number;
        System.out.println(secondOP + ": we finally cleared  the bit 1 from posistion at 2 ");
    }
}
