package Basics.LL;

import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class PalindromeLinkedList {

    public static Node convertArrtoLL(int[] arr) {

        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;

    }

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " - > ");
            head = head.next;
        }

        System.out.println(" ");
    }

    public static boolean isPalindromeAPPROACH1(Node head) {

        Node forward = head;
        Node backward = null;

        // here we will be creating a whole new listlist complete copy of the head

        Node newhead = null;
        Node newtail = null;
        Node temp = head;
        while (temp != null) {
            if (newhead == null) {
                newhead = temp;
                newtail = temp;
            } else {
                newtail.next = temp;
                newtail = temp;
            }
            temp = temp.next;
        }
        backward = newhead;

        Node prev = null;
        Node front = null;
        while (backward != null) {
            front = backward.next;
            backward.next = prev;
            prev = backward;
            backward = front;
        }

        backward = prev;

        while (forward != null) {

            if (forward.data != backward.data) {
                return false;
            }
            System.out.println("DATA FORWARD" + forward.data);
            System.out.println("BACKWARD DATA " + backward.data);
            forward = forward.next;
            backward = backward.next;

        }
        return true;

    }

    public static boolean ispalindromeAPPROACH2(Node head) {

        Stack<Integer> stack = new Stack<>();

        Node temp = head;

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {

            if (temp.data != stack.peek()) {
                return false;
            }
            stack.pop();
            temp = temp.next;

        }
        return true ; 
    }

    public static boolean ispalindromeAPPROACH3(Node head) { 

        Node slow = head ; 
        Node fast = head ; 

        while( fast.next!=null && fast.next.next!=null){
            slow=slow.next ; 
            fast = fast.next.next ; 
        }

        // now reverse from the slow (because we got the middle node if it is odd or even)
        Node front = null ;
        Node prev = null ; 
        slow = slow.next ;
        while(slow!=null){
            front = slow.next ; 
            slow.next = prev ; 
            prev = slow ; 
            slow = front ;
        }
      
        slow = prev ; 

        Node temp = head; 
        printLL(slow);
        printLL(temp);
        while(slow != null){
          if(slow.data!=temp.data){
               // LL ko wapis original form me leke jaao 

            return false;
          }
          slow=slow.next ; 
          temp=temp.next;
        }

         // LL ko wapis original form me leke jaao 
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2,4,2,1};

        Node result = convertArrtoLL(arr);
        System.out.println(ispalindromeAPPROACH3(result));
    }
}
