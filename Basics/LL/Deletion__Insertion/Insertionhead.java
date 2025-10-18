package Basics.LL.Deletion__Insertion;

public class Insertionhead {

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

    public static Node Insert(Node head, int ele ) {

        // one way
    // {  Node temp = new Node(ele);
    //   temp.next = head;
    //    return temp;}

       // other way

       Node temp = new Node(ele , head);
       return temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node result = arr2LL(arr);
        Node result2 = Insert(result, 26);
        printLL(result2);
    }
}
