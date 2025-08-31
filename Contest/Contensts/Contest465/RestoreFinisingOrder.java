package Contest.Contensts.Contest465;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RestoreFinisingOrder {
    
    public static void main(String[] args) {

        int[] order = {1,4,5,3,2};
        int[] friends = {2,5};

        int[] result = recoverOrder(order, friends);
        System.out.println("RESULT : " + Arrays.toString(result));
        
    }

    // This way my TC becoms o(N*M)
    // public static int[] recoverOrder(int[] order, int[] friends) {
        
    //     int[] newarr = new int[friends.length];
    //     ArrayList<Integer> arralist = new ArrayList<>();

    //     for(int i = 0 ; i <order.length ; i++){
    //         for(int j = 0 ; j<friends.length; j++){

    //             if(order[i] == friends[j]){
    //                 arralist.add(order[i]);
    //             }
    //         }
    //     }

    //     for (int i = 0; i < arralist.size(); i++) {
    //         newarr[i] = arralist.get(i);
    //     }
    //     return newarr;
    // }


    // This way we will make the TC O(N+M)
    public static int[] recoverOrder(int[] order, int[] friends) {
        
        HashSet <Integer> map = new HashSet<Integer>();
        int[] newarr = new int[friends.length];
        int id = 0 ;
        for(int i = 0 ; i<friends.length; i++){
            map.add(friends[i]);
        }
   
        for(int i = 0 ; i<order.length; i++){
            if(map.contains(order[i])){
               newarr[id++] = order[i];
            }
        }

        return newarr;
    }
}
