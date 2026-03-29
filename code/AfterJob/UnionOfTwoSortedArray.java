package code.AfterJob;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {

        int[] a = { 2, 2, 3, 4, 5 };
        int[] b = { 1, 1, 2, 3, 4 };

        findUnion(a, b);

    }

    // public static ArrayList<Integer> findUnion(int a[], int b[]) {
    // // code here

    // TreeSet<Integer> uniqueNumbers = new TreeSet<>();

    // for(int i = 0 ; i<a.length ; i++){
    // uniqueNumbers.add(a[i]);
    // }
    // for(int i = 0 ; i<b.length ; i++){
    // uniqueNumbers.add(b[i]);
    // }

    // ArrayList<Integer> arrayList = new ArrayList<>(uniqueNumbers);
    // return arrayList;
    // }


    //  - MY ALGORIGHTM , it takes more than 1 seconds to get executed 
//     public static ArrayList<Integer> findUnion(int a[], int b[]) {


//         // code here
//         ArrayList<Integer> list = new ArrayList<>();

//         int i = 0;
//         int j = 0;

//         while (i < a.length && j < b.length) {
//             if (list.size() > 0) {
//                 boolean isFound = false;
//                 for (int num : list) {
//                     if (num == a[i]) {
//                         isFound = true;
//                         i++;
//                         break;
//                     }
//                 }

//                 if (!isFound) {

//                     for (int num : list) {
//                         if (num == b[j]) {
//                             isFound = true;
//                             j++;
//                             break;
//                         }
//                     }
//                 }

//                 if (isFound) {
//                     continue;
//                 }

//             }

//             if (a[i] <= b[j] && i < a.length) {
//                 list.add(a[i]);
//                 i++;
//             } else {
//                 list.add(b[j]);
//                 j++;
//             }

//         }

//         // process remaining elements of a[]
//         while (i < a.length) {
//             boolean isFound = false;

//             for (int num : list) {
//                 if (num == a[i]) {
//                     isFound = true;
//                     break;
//                 }
//             }

//             if (!isFound) {
//                 list.add(a[i]);
//             }
//             i++;
//         }

//         while( j < b.length ){
//             boolean isFound = false;

//             for(int num:list){
//                 if(num == b[j]){
//                     isFound = true;
//                     break;
//                 }
//             }
//             if(!isFound){
//                 list.add(b[j]);
//             }
//             j++;
//         }
//         System.out.println(list);


//     return list;

// }




    public static ArrayList<Integer> findUnion(int a[], int b[]) {
    ArrayList<Integer> list = new ArrayList<>();

    int i = 0, j = 0;

    while (i < a.length && j < b.length) {

        int val;

        if (a[i] <= b[j]) {
            val = a[i];
            i++;
        } else {
            val = b[j];
            j++;
        }

        if (list.isEmpty() || list.get(list.size() - 1) != val) {
            list.add(val);
        }
    }

    while (i < a.length) {
        if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
            list.add(a[i]);
        }
        i++;
    }

    while (j < b.length) {
        if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
            list.add(b[j]);
        }
        j++;
    }

    return list;
}
}
