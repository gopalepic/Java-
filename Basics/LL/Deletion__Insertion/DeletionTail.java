package Basics.LL.Deletion__Insertion;


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


public class DeletionTail {
    
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

    public static void printLL(Node head){
        while(head!=null){
            System.out.print (head.data + " - > " + (head.next==null? "null " : " "));
            head=head.next;
        }
    }

    public static Node deleteTail(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node temp = head;

        while(temp.next.next != null){
            temp=temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node result = arr2LL(arr);
        Node result2 = deleteTail(result);
        printLL(result2);
    }
}
