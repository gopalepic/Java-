class Node {
    int data; 
    Node next; 

    Node(int newdata) {
        data = newdata;
        next = null;
    }
}

public class ReverseLinkedList {
    
    Node head; // head of the list

    // Method to calculate the length of the linked list
    public Node reverse() {
        Node prev = null , current = head ;

        while (current != null ) {
            Node nxt = current;
             current = current.next;
              nxt.next = prev;
              prev = nxt;
        }

        return prev; 
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        
        // Adding some nodes to the linked list
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        // Get the length of the linked list
        Node length = list.reverse();
        System.out.println(" Out reverse list look likes " + length);
    }
}

  