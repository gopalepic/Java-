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
public class DLL {

    
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

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node result = arr2DLL(arr);
        print(result);
    }
    
}
