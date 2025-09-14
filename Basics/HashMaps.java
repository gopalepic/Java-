package Basics;
import java.util.HashMap;
import java.util.Map;
public class HashMaps {
    
    public static void main(String[] args) {
        
        HashMap <Character,Integer> map = new HashMap<>();

        String s = "aaaabbcccceedd";
        for( char c : s.toCharArray()){

            map.put(c, map.getOrDefault(c,0)+1);

        }
        System.out.println("MAP " + map);

       for( Map.Entry<Character,Integer> gopu: map.entrySet()){

                  System.out.println("KEYS " + gopu.getKey() + " Value " + gopu.getValue());

                  if(gopu.getValue() == 4){
                    System.out.println("I AM THE KEY " + gopu.getKey() + " having value " + gopu.getValue());
                  }
        }
    }
}
