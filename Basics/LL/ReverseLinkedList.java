package Basics.LL;

class Node {
    int data;
    Node next;

    Node(int newdata) {
        this.data = newdata;
        this.next = null;
    }

    Node(int newdata, Node next1) {
        this.data = newdata;
        this.next = next1;
    }
}

public class ReverseLinkedList {

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " - > " + (head.next == null ? "null " : " "));
            head = head.next;
        }
    }

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

    public static Node reverse(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;
        Node prev = null;
        Node nx = null;

        while (temp != null) {
             
            nx = temp;
            temp=temp.next;
            nx.next = prev;
            prev=nx;
          
        }
        return temp;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        Node result = arr2LL(arr);

        Node revere = reverse(result);
        print(revere);
    }
}
