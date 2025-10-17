package Basics.LL;


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


public class lengthofLL {

     public static int arr2LL(int[] arr) {

        Node head = new Node(arr[0]);
        int cnt = 1 ;
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
            cnt++;
        }
        return cnt;

    }
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        int result = arr2LL(arr);
        System.out.println("LEN " + result);
    }
}
