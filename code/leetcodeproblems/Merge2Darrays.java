import java.util.*;

public class Merge2Darrays {
    public static void main(String[] main ){

        // [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
// Output: [[1,6],[2,3],[3,2],[4,6]]
// 

        int[][] nums1 = new int[][] {{1,2},{2,3},{4,5}};
        int[][] nums2 = new int[][] {{1,4},{3,2},{4,1}};

        int[][] mergenew = new int[][] {};
       

        int i = 0;
        int j = 1 ;
        
        while (i<5){
            if(nums1[i][0] == nums2[i][0]){
                mergenew[i][j] = [i][nums1[i][j] + nums2[j][j]];
            }
        }
        // mergeArrays(nums1,nums2);
    }

    // public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        
    // }
}
