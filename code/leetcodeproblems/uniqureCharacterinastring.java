import java.util.HashMap;

public class uniqureCharacterinastring {
    public static void main(String[] args) {
        String s = "loveleetcode" ;
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> Map = new HashMap<>();
        for(int i = 0 ; i<s.length() ;i++){
             char c = s.charAt(i);
          System.out.println(Map);
           Map.put(c, Map.getOrDefault(c , 0) + 1);
        }
        for(int i = 0 ; i<s.length();i++){
          if(Map.get(s.charAt(i)) == 1){
            return i;
          }
        }
        return -1;
    }
    
}
