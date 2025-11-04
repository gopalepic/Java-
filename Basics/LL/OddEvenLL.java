package Basics.LL;

import java.util.Stack;

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

public class OddEvenLL {

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

    public static Node OddEvenLL(Node head ){
         Stack<Integer> stackodd = new Stack<>();
        Stack<Integer> stackeven = new Stack<>();

        Node temp = head ; 

        while(temp!=null){
            if(temp.data%2 == 0){
                stackeven.push(temp.data);
            }else{
                stackodd.push(temp.data);
            }
            temp=temp.next; 
        }

        temp = head ; 

        while(temp!=null){
           
            int data = stackodd.peek();
            Node newNode = new Node(data);
            stackodd.pop();

        } 
    }

     public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " - > ");
            head = head.next;
        }

        System.out.println(" ");
    }


public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6};
       Node result = arr2LL(arr);

       Node result2 = OddEvenLL(result);
       printLL(result2);
}
}
