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

public class DeleteKthNode {

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

    public static Node delete(Node head, int k) {
        if (head == null) {
            return head;
        }
        if (k == 1) {
            head = head.next;
            return head;
        }
        Node prev=null ; Node temp = head ; int cnt =0;

        while(temp != null){
            cnt++;
            if(cnt == k ){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp=temp.next;
        }

        return head;
    }

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};

        Node result1 = arr2LL(arr); // LL ban gaye

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter kth node to delete: ");
        int k = scn.nextInt();  // User se kth node leliya delete krne ke leye 

        Node result2 = delete(result1, k);

        printLL(result2);



        
    }
}
