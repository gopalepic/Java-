package Basics.LL;

import java.util.ArrayList;

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

public class AddtwoNumbers {

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
            System.out.print(head.data + " - > ");
            head = head.next;
        }

        System.out.println(" ");
    }

    public static Node reverse(Node head) {
        Node front = null;
        Node prev = null;

        Node temp = head;

        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }

    public static Node addTwoNumbers(Node l1, Node l2) {

        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        while (l1 != null) {
            num1.append(l1.data);
            l1 = l1.next;
        }
        while (l2 != null) {
            num2.append(l2.data);
            l2 = l2.next;
        }
        System.out.println(num1);
        System.out.println(num2);

        int result = Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString());

        ArrayList<Integer> ans = new ArrayList<>();

        if (result == 0) {
            ans.add(0);
        } else {
            while (result >= 0) {
                int lastdigit = result % 10;
                ans.add(lastdigit);
                result /= 10;
            }
        }

        System.out.println(ans);

        Node newNode = new Node(ans.get(0));
        Node temp = newNode;
        int cnt = 1;

        System.out.println("SIZE " + ans.size());
        while (cnt < ans.size()) {

            Node moreNode = new Node(ans.get(cnt++));
            temp.next = moreNode;
            temp = moreNode;
        }

        printLL(newNode);
        return newNode;

    }

    public static void main(String[] args) {
        int[] arr1 = { 0 };
        int[] arr2 = { 0 };

        Node result1 = arr2LL(arr1);
        Node result2 = arr2LL(arr2);

        Node res1 = reverse(result1);
        Node res2 = reverse(result2);
        printLL(res1);
        printLL(res2);

        addTwoNumbers(res1, res2);

    }

}
