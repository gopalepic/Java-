
 
 

public class MiddleoftheLinkedList {
    

     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

   public static ListNode middleNode(ListNode head) {

    if(head == null || head.next == null){
        return head;
    }
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!= null && fast != null){
            slow = slow.next;
            fast = fast.next.next;

            return slow;
        }
    }
  public static void main(String[] args) {
    
  }
}
