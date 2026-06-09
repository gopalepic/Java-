package code.Searching.LinearSearch;

public class SearchingInString {

    public static void main(String[] args) {
        char c = 's';
        System.out.println(search("HelloKesohoAPp", c));
    }
    static boolean search (String str , char target){
        if(str.length() == 0 ){
            return false;
        }
  System.out.println(str.toCharArray());
  
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }

        // for(int i = 0 ; i<str.length();i++){
        //     if(str.charAt(i) == target){
        //         return true ;
        //     }
        // }
        return false;
    }
}
