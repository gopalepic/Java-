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


public class InsertElement {
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


    // Insert before value ele
    public static Node insert(Node head, int ele , int k ) {
        
        if(head==null){
            return head;  
        }

        if(head.data == k){
            return new Node(ele,head);
        }
  
        // MY APPROACH 
        // Node temp = head;
        // Node prev = null;
        // while(temp!= null){
            
        //     if(temp.data == k){
            
        //         Node newNode = new Node(ele,temp);
        //         prev.next=newNode;
        //         break;
        //     }
        //     prev = temp;
        //     temp=temp.next;
           
        // }

        // Strivers approach

        Node temp = head;

        while(temp.next != null){
            if(temp.next.data == k){
                Node newNode = new Node(ele,temp.next);
                temp.next=newNode;
                break;
            }
            temp=temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        Node result = arr2LL(arr);
        Node result2 = insert(result,26 ,1);
        printLL(result2);
    }
}
