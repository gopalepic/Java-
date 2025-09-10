import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {

        // its working well
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int i = 0;
        // int j = arr.length - 1;
        // while (i < j) {
        //     if (arr[i] < arr[j]) {
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //     }
        //     i++;
        //     j--;
        // }

        // System.out.println("REVERSED  Array " + Arrays.toString(arr));

        int num = 12345;
    
        StringBuilder s = new StringBuilder();
        while(num != 0){
            int lastDigit = num%10;
            num = num/10;
            s.append(lastDigit);
            System.out.println("LASt DIGITS " + lastDigit);
        }

        System.out.println("NUMBER " +s);

        // Convert the StringBuilder to String before parsing to int
        int nN = Integer.parseInt(s.toString());
        // Explanation: StringBuilder does not directly convert to int.
        // We first convert it to a String using toString(), then parse it to int.
    }
}
