class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}

public class DeleteinaSingleLINKEDList {


    public static void main(String[] args) {
        
         String input ="10, 20, 30, 40, 50";
        String[] Values = input.split(",");
       
        ListNode head = null;
        ListNode current = null;


        for(String Val : Values){
            ListNode newNode = new ListNode(Integer.parseInt(Val.trim()));
             if(head == null){
                head = newNode;
                current = head;
             }
             else{
                
                current.next = newNode;
                 current = newNode;
             }
            
        }
    
    }

    Node deleteNode ( Node head , int x ){
        Node current = head;
  
        

    }


}
