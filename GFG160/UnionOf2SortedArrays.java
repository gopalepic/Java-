package GFG160;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.Set;

public class UnionOf2SortedArrays {
    public static void main(String[] args) {
        int[] a = { 2, 2, 3, 4, 5 };
        int[] b = { 0, 0, 1, 1, 2, 3, 4, 6 };
        findUnion(a, b);
    }

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here

        // ArrayList<Integer> list = new ArrayList<>();
        // int i = 0 , j = 0 ;

        // for(; i<a.length ;i++){
        // if(!(list.contains(a[i]))){
        // list.add(a[i]);
        // }

        // }

        // for(; j<b.length ; j++){
        // if(!(list.contains(b[j]))){
        // list.add(b[j]);
        // }

        // Collections.sort(list); 
         // System.out.println(list);

        // return list;


 // Using Set is another way to solve this problem , 

 // Set is resposible for storing elements and it will be sorted as well
        // Set<Integer> set = new TreeSet<>();

        // for (int i = 0; i < a.length; i++) {
        //     set.add(a[i]);
        // }

        // for (int j = 0; j < b.length; j++) {
        //     set.add(b[j]);
        // }

        // System.out.println("SET " + set);

        // ArrayList<Integer> res = new ArrayList<>(set);
        // System.out.println("ArrayList " + res);

      
        // return res;

        // Its the Best and expected way 

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0 ; 
        int j = 0 ;

        while(i< a.length && j<b.length){

            if(i> 0 && a[i-1] == a[i] ){
                i++;
                continue;
            }

            if(j> 0 && b[j-1] == b[j]){
                j++;
                continue;
            }

            if(a[i] < b[j]){
                list.add(a[i]);
                i++;
            }
            else if(a[i] > b[j]){
                list.add(b[j]);
                j++;
            }
            else{
                list.add(a[i]);
                i++;
                j++;
            }
        }

        while(i<a.length ){
            if(i>0 && a[i-1] == a[i]){
                i++;
                continue;
            }

            list.add(a[i]);
            i++;
        }

        while(j<b.length){
            if(j>0 && b[j-1] == b[j]){
                j++;
                continue;
            }

            list.add(b[j]);
            j++;
        }


        System.out.println("ANS " +list);
        return list;
    }
}
