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

public class praticeInsertion {
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

    public static Node insertAtK(Node head, int ele, int k) {
        

        if (head.next == null) {
            if (k == 1) {
              Node newNode = new Node(ele);
             
              return newNode;
            }
        }

        if (k == 1) {
            Node newNode = new Node(ele,head);
            return newNode;
        }

        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {

           cnt++;

           if(cnt==k){
              Node addNode = new Node(ele);
              prev.next = addNode;
              addNode.next=temp;
              break;
           }
           prev=temp;
           temp=temp.next;
            
        }

        return head;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        Node result = arr2LL(arr);
        Node result2 = insertAtK(result, 26, 2);
        printLL(result2);
    }
}
