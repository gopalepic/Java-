package Basics.BitManipulation;

public class RemoveTheLastIthbit {
    public static void main(String[] args) {
    System.out.println(removeIthBit(9));
    }

    public static int removeIthBit(int n) {

        return n & n - 1;
    }
}
