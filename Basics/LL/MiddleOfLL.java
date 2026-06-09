package Basics.LL;


class Node{
    int data ;
    Node next ;

    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class MiddleOfLL {
    
    public static int convertArrtoLL(int[] arr){
  
      Node head = new Node(arr[0]);
      Node mover = head;
      
      for(int i = 1 ; i<arr.length ; i++){
         Node temp = new Node(arr[i]);
         mover.next = temp;
         mover = temp;
          System.out.print( mover.data+ " --> ");
      }

      return head.data;
      
    
}

  public static Node middle(Node head ){

    Node slow = head ; 
    Node fast = head ; 

    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
  }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        
        int result = convertArrtoLL(arr);

        System.out.println("RESULT " + result);
        
    }

   
}
