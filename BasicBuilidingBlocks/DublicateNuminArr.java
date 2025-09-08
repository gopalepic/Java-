import java.util.HashSet;

public class DublicateNuminArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 5 };

        int result = DublicateNumber(arr);
        System.out.println("RESULT " + result);

    }

    public static int DublicateNumber(int[] arr) {

        // HashMap<Integer, Boolean> map = new HashMap<Integer,Boolean>();

        // for (int i = 0; i < arr.length; i++) {
        //     if (map.containsKey(arr[i])) {
        //         return arr[i];
        //     } else {
        //         map.put(arr[i],false);
        //     }
        //     System.out.println("MAP " + map);
        // }

        // return 0;


        HashSet<Integer> map = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.contains(arr[i])) {
                return arr[i];
            } else {
                map.add(arr[i]);
            }
            System.out.println("MAP " + map);
        }
        return 0;
    }
}
