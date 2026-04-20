package code.AfterJob;

import java.util.Stack;

public class reverseaStack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        int[] arr = { 1,2,3,4};
        for (int i : arr) {
            st.add(i);
        }
        System.out.println(
                "ST " + st);
        reverseStack(st);
    }

    // public static void reverseStack(Stack<Integer> st) {
    //     Stack<Integer> reverseSt = new Stack<>();

    //     while (!st.isEmpty()) {
    //         int ele = st.peek();
    //         reverseSt.add(ele);
    //         st.pop();

    //     }

    //     int i = 0 ; 
    //     while (i<reverseSt.size()){

    //         st.add(reverseSt.get(i));
    //         i++;
    //     }

    //     System.out.println("ST " + st);
      
    // }

    public static void reverseStack(Stack<Integer> st) {

        if(st.empty()){
            return ;
        }

        int ele = st.pop();
        reverseStack(st);

 
        st.addFirst(ele);

        

        
    }

    
}
