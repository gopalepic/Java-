package Basics.LL.Deletion__Insertion;
import java.util.Scanner;


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


public class DeleteElement {
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

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " - > " + (head.next == null ? "null " : " "));
            head = head.next;
        }
    }

    public static Node delete(Node head, int ele) {

        if(head == null){
            return head;
        }
        if (head.data == ele) {
            head=head.next;
            return head;
        }
       
        Node prev=null ; Node temp = head ; 

        while(temp != null){
          
            if(temp.data == ele ){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp=temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node result = arr2LL(arr);
        Scanner scn = new Scanner(System.in);
        System.out.print("ENTER ele to delete: " );
        int ele = scn.nextInt();
        Node result2 = delete(result, ele);
        printLL(result2);
    }
}
