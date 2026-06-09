package code.Dailyquestion;

public class CheckifDigitsAreEqual {
    public static void main(String[] args) {

        String s = "3902";
        hasSameDigits(s);

    }

    public static boolean hasSameDigits(String s) {

        StringBuilder sub = new StringBuilder(s);
        int i = 0 ;
        StringBuilder newsub = new StringBuilder();
       while (sub.length()!=2) {

        newsub.append(s.charAt(i)+s.charAt(i+1)%10);
             
        
       }

    }
}
