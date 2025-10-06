package ONLINE_Assignments;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// we are requried to find the the orderdred Pairs between two numbers 
// where the XOR of the two elements in range or the element itself
// is as same as the the normal sum of two elements 

// well the funfact is to make the a^b == a+b 
// there should be a condition
// which is , when a&b == 0  But why ? 

// because if we have a = 101 and b = 111 then result (a+b) => 1100
// right? , but we know that the number who are having carry as (1) will
// not be able to get equal to a^b , beacuse XOR not do the carray 

// what we want a^b == a+b (but a+b will make sure that there will be carray but xor does't)

// so just to replace the possiblity where the carray can be obtained , 
// we did a&b == 0  , because this condtion states completely that no same elments should be present in the array 
// and hence we are not confirmed that if no carray has been taken place then 
// a^b and a+b are equal
public class OrderedPairs {

    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(1)));
        list.add(new ArrayList<>(Arrays.asList(4)));
        
        NumberofOrderPairs(list);

    }

    public static List<List<Integer>> NumberofOrderPairs(List<List<Integer>> nums){

        List<List<Integer>> list = new ArrayList<>();

        int firstEle = nums.get(0).get(0);
        int secondEle = nums.get(1).get(0);

        System.out.println("FI " + firstEle + " + se " + secondEle);

        int min = Math.min(firstEle,secondEle);
        int max = Math.max(firstEle,secondEle);

        System.out.println("MIN " + min  + " Max " + max);
        // Now to find the number of elments where a^b == a+b 
 
        int cnt = 0 ;
        for(int i = min ; i <= max;i++){

            for(int j = min; j<=max ; j++){

                if((i&j) == 0 ){
                     list.add(Arrays.asList(i,j));
                     cnt++;
                }
            }
        }

        System.out.println("TOTAL ELEMENTS ARE " + list +" " + "and cnt is " + cnt );

        return list;

        
    }
    
}
