import java.util.Stack;
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }

      public static boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        System.out.println("hey i am the length " + s.length());
        for(char c : s.toCharArray()){
          if(s.length() ==  0 & c == '(' || c=='{' || c=='['){
                 return true;
          }
          if(c == '(' || c=='{' || c=='['){
                stack.push(c);
          }
          else{
            System.out.println("I am the c in the else loop " + c);
               if (stack.isEmpty() || 
         (c == ')' && stack.pop() != '(') ||
         (c == '}' && stack.pop() != '{') ||
         (c == ']' && stack.pop() != '[')) {
          return false;

       }
            }
          }


          return stack.isEmpty();
        }
        
    }

