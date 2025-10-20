package Basics.DoubleLL;


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
        if(head == null){
            return head;
        }
        
        head= head.next;
        head.prev = null;

        return head;

    }

    public static Node DeleteTail(Node head){
        if(head==null){
            return head;
        }

        Node temp = head;

        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;

        return head;
    }

    public static Node deleteKthNode(Node head , int K ){

        
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node result = arr2DLL(arr);
        Node result1 = DeleteTail(result);
        print(result1);
    }
}
