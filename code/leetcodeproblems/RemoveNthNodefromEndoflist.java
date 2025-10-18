package code.leetcodeproblems;
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveNthNodefromEndoflist {


     public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " - > " + (head.next == null ? "null " : " "));
            head = head.next;
        }
    }

    public static ListNode arr2LL(int[] arr) {

        ListNode head = new ListNode(arr[0]);

        ListNode mover = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;

    }

      public static ListNode removeNthFromEnd(ListNode head, int n) {
        
        // First find length;
        // then minus iterative from length , then function to remove

        //length

        int cnt = 0 ;
        ListNode temp = head;

        while(temp!= null){
            cnt++;
            temp= temp.next;
        }
        System.out.println("LEN " + cnt);

        return temp;
    } 

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        ListNode result = arr2LL(arr);

        ListNode result2 = removeNthFromEnd(result, 4);


    }
}
