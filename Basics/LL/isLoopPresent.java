package Basics.LL;
import java.util.HashMap;
public class isLoopPresent {

     public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " - > " + (head.next == null ? "null " : " "));
            head = head.next;
        }
    }

    public static Node arr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }
// Loop means , if the same node appears twice 

// THIS IS NOT OPTIMAL APPROACH , APP APPRAOCH IS USING FAST ANS SLOW POINTER 
    public static Boolean isLoopinLL(Node head ){
 
        Node temp = head ; 

        HashMap<Node,Integer> map = new HashMap<>();
        boolean isvalidlooppresent = false;
        while(temp!=null){
            if(map.containsKey(temp)){
               isvalidlooppresent  = true;
               break;
            }
            map.put(temp, 0);
            temp=temp.next;
        }

        return isvalidlooppresent;

    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,2};

        Node result = arr2LL(arr);
        System.out.println(isLoopinLL(result));
    }
    
}
