package code.AfterJob;

import java.util.List;

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

public class reverseLinkedList {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        ListNode output = createLL(arr);

        System.out.println("BEFORE change");
        showll(output);

        System.out.println("AFTER CHAGE");
        ListNode res = reverseList(output);

        showll(res);

    }

    public static ListNode createLL(int[] arr) {

        ListNode head = new ListNode(arr[0]);

        ListNode child = head;
        for (int i = 1; i < arr.length; i++) {

            ListNode temp = new ListNode(arr[i]);
            child.next = temp;
            child = temp;
        }

        return head;
    }

    public static void showll(ListNode ll) {
        while (ll != null) {
            System.out.print(ll.val + " -> ");
            ll = ll.next;
        }
    }

    public static ListNode reverseList(ListNode head) {

        ListNode theNext = null;
        ListNode prev = null;
        ListNode current;

        current = head;

        while (current != null) {

            theNext = current.next;
            current.next = prev;

            prev = current;
            current = theNext;
        }

        return current;

    }
}
