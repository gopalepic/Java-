package Basics.DoubleLL;

import Basics.LL.Deletion__Insertion.DeleteKthNode;

class Node{
    int data ; 
    Node next ; 
    Node prev ; 

    Node (int data1 , Node next1 , Node prev1){

        this.data = data1;
        this.next = next1;
        this.prev = prev1;

    }

    Node (int data1 ){
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}


public class DeletionDLL {


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

    public static void print(Node head){
        while(head!=null){
            System.out.print (head.data + " < == > " + (head.next==null? "null " : " "));
            head=head.next;
        }

    }

    public static Node Deletehead(Node head){
        if(head == null || head.next == null){
            return head;
        }
        
        head= head.next;
        head.prev = null;

        return head;

    }

    public static Node DeleteTail(Node head){
        if(head==null || head.next == null){
            return null;
        }

        Node temp = head;

        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next.prev = null;
        temp.next=null;
        

        return head;
    }

    private static Node DeleteTailApproach1 (Node head ){
        if(head==null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next != null){
             temp=temp.next;
        }
        Node back = temp.prev;
        back.next = null;
        temp.prev = null;
        return head;
    }

    public static Node deleteKthNode(Node head , int K ){

        Node temp = head;

        int cnt = 0 ; 

        while(temp!=null){
            cnt++;

            if(cnt == K){
                break;
            }
            temp=temp.next;
        }

        // two cases ,if its the first element 
        // means it just points to next , no prev 

        // or what if it the tail element 
        // means not next  , only prev points to some node 

        Node back = temp.prev;
        Node front = temp.next;

        if(back == null && front == null){
            return null;
        }

        if(back == null && front!=null){
            // delete the first element

           head =front ;
           head.prev = null;

            return head;
            
        }
        if(back != null && front == null){
             // delete the tail element 

             back.next = null;
             temp.prev =null;

             return head;
        }

        back.next=front;
        front.prev = back;
        temp.next = null;
        temp.prev = null;

        return head;
        
    }

 // when we are requried to delete a particular NODE 

 // constrains , item to be deleted is never the head of the DLL
    public static Node deleteElement(Node head, Node targetNode ){
        
       
 

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node result = arr2DLL(arr);
        Node result1 = deleteKthNode(result,1);
        print(result1);
    }
}
