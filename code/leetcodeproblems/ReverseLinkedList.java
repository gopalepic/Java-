package code.leetcodeproblems;

class Node {
    int data; 
    Node next; 

    Node(int newdata) {
       this.data = newdata;
       this.next = null;
    }

    Node (int newdata , Node next1){
        this.data = newdata;
        this.next = next1;
    }
}

public class ReverseLinkedList {
    

    public static Node int2LL(int[] arr){
      Node head = new Node(arr[0]);
      Node mover = head;
      
      for(int i = 1 ; i<arr.length ; i++){
         Node temp = new Node(arr[i]);
         mover.next = temp;
         mover = temp;
      }

      return head;
    }

    public static void main(String[] args) {
       

    }
}

  