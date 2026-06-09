package code.AfterJob;

public class RemoveOuterMostParanthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        String output = removeOuterParentheses(s);
        System.out.println(output);
    }

    public static String removeOuterParentheses(String s) {

        StringBuilder str = new StringBuilder();

        int cnt = 0;
        for (char c : s.toCharArray()) {

            if(c == '(' && cnt == 0){
                cnt++;
                continue;
            }
            else if (c=='(' && cnt > 0 ){
                cnt++;
                str.append(c);
            }
            else if (c == ')' && cnt > 1){
                cnt--;
                str.append(c);
            }
            else if (c == ')' && cnt == 1){
               cnt--;
            }
        }

        return str.toString();

    }
}
