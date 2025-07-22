package Contest;

public class ReformatPhoneNumber {
    public static void main(String[] args) {
        String s = "123 4-567©leetcode";
        reformatNumber(s);
    }

    public static void reformatNumber(String number) {

        String validNums = number.replaceAll("[^0-9]+", "");

        // now divide them in blocks

        StringBuilder subString = new StringBuilder();
        int length = validNums.length();

        int i = 0;
        while (length != 0) {

            

            if(length>4){
              validBlock( validNums,i,length,subString);
              System.out.println(length);
            }
            if(length == 4){
              i =  validBlock1( validNums,i,length,subString);
            }
            if(length == 3 ){
               i =   validBlock2( validNums,i,length,subString);
            }
            if(length == 2){
               i =   validBlock3( validNums,i,length,subString);
            }
        }

        System.out.println(subString);
    }

    // when length is greater than 4
    public static int validBlock(String validNums, int i, int length, StringBuilder subString) {
        if (length > 4) {
            for (i = 0; i < 4; i++) {
                subString.append(validNums.charAt(i));
            }

            subString.append("-");

            length = length - 3;

        }

        return i;
    }

    // when length is 4
    public static int validBlock1(String validNums, int i, int length, StringBuilder subString) {
        if (length == 4) {
            for (; i < 2; i++) {
                subString.append(validNums.charAt(i));
            }
            subString.append("-");

            for (; i < 2; i++) {
                subString.append(validNums.charAt(i));
            }
            subString.append("-");

            length = length - 4;

        }

        return i;
    }
// when length is 3
    public static int validBlock2(String validNums, int i, int length, StringBuilder subString) {
        if (length == 3) {
            for (; i <= 3; i++) {
                subString.append(validNums.charAt(i));
            }

            length = length - 3;

        }

        return i;
    }

    // when length is 2
      public static int validBlock3(String validNums, int i, int length, StringBuilder subString ){
              if (length == 2) {
                for ( ; i < 2; i++) {
                    subString.append(validNums.charAt(i));
                }

                subString.append("-");
                length = length - 2;
            }

             return i;
    }

}
