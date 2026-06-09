package Contest.Contensts.contest466;

public class MinimumOpertaioninString {
    public static void main(String[] args) {

        String s = "yz";

        int value = minOperations(s);
        System.out.println(value);
    }

    public static int minOperations(String s) {
        
        // THIS code works but it does not finds the "MINIMUM OPERATIONS requried "
        // StringBuilder string = new StringBuilder();
        // s.toLowerCase();
        
        // int count = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     System.out.println(s.charAt(i));
        //     char c = s.charAt(i);
        //     int j = (int) c;
        //     while (c != 'a') {
        //         System.out.println("I am the Character " + c);
        //        count ++;
        //         if (j > 121) {
        //             j = j - 26;
        //         }

        //         j++;
        //         c = (char)j;
                
        //         System.out.println("I am J " + j);
        //     }
        //     string.append(c);
        // }
        //   System.out.println("END PRODUCT " + string);
        // System.out.println("COUNT " + count);


        // working code 

        boolean flag = false ; 
        char min = 'z';
        for(int i = 0 ; i <s.length() ; i++){
            char ch = s.charAt(i);

            if(ch != 'a' && ch<=min){
                min=ch;
                flag = true;
            }
        }

        int index = min - 'a';

        return flag ? 26-index : 0;



    }

}
