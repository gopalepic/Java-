package code.BasicMath;

public class Matric {
    public static void main(String[] args) {
        

        int[][] arr = {{1,2,3},{3,4,5},{5,6,7}};

        for(int i = 0  ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[i].length;j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
