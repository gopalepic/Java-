package Basics.DoubleLL;

import java.util.Stack;

class Node{
    int data;
    Node next ;
    Node prev ;

    Node (int data1 ,Node next1 ,Node preq1){
      this.data = data1;
      this.next = next1;
      this.prev = preq1;
    }

    Node (int data1 ){
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}

public class ReverseDLL {
    
      public static Node arr2DLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i = 1 ; i<arr.length ; i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev=temp;
        }

        return head;
    }

// Brute Force 
    // public static Node Reverse(Node head ) {
 
    //     Stack<Integer> list = new Stack<>();
    //     Node temp = head ; 

    //     while(temp!=null){
    //         list.push(temp.data);
    //         temp=temp.next;
    //     }

    //     temp = head ; 

    //     while( temp!=null){

    //         temp.data = list.peek();
    //         list.pop();
    //         temp=temp.next;
    //     }

    //     return head;

    // }

    public static void print(Node head){
        while(head!=null){
            System.out.print (head.data + " < == > " + (head.next==null? "null " : " "));
            head=head.next;
        }
    }

    // Most Optimal

    public static Node reverse(Node head ){

        if(head ==null || head.next == null){
            return head ;
        }
        Node last = null;
        Node curr = head;

        while(curr != null){

            last = curr.prev;

           curr.prev = curr.next;
           curr.next = last;

           curr = curr.prev;
        }

        return last.prev;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        Node result = arr2DLL(arr);
        
        Node res = reverse(result);
        print(res);

    }
}
