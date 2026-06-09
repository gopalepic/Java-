import java.lang.reflect.Array;
import java.util.*;

class ListNode{

    int value ; 
    ListNode next;

    ListNode (int value ) { 
        this.value = value ; 
        this.next = null;
    }
}

 class Cycledetectedinlinkedlist {
  
    public static void main(String[] args) {
        String input ="10, 20, 30, 40, 50";
        String[] Values = input.split(",");
       
        ListNode head = null;
        ListNode current = null;


        for(String Val : Values){
            ListNode newNode = new ListNode(Integer.parseInt(Val.trim()));
             if(head == null){
                head = newNode;
                current = head;
             }
             else{
                
                current.next = newNode;
                 current = newNode;
             }
            
        }

        System.out.println(hasCycleorNot(current));
    
    }

    public static boolean hasCycleorNot(ListNode head){
           ListNode slow = head;
           ListNode fast = head;

           while(fast != null && fast.next != null){
             slow = head.next;
             fast = head.next.next;

             if(slow == fast){
                return true;
             }
           }

           return false;
    }
}
