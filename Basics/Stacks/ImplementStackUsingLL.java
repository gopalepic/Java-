package Basics.Stacks;

import java.util.Scanner;

class Node {

    int val;
    Node next;

    Node(int num) {
        this.val = num;
        this.next = null;
    }
}

public class ImplementStackUsingLL {
    // The problem with array is that we have to define specific Size of the array
    // But this is not the case with LinkedList, they are dynamic in nature

    private Node head; // top of the stack
    private int size; // size of the stack

    public ImplementStackUsingLL() {
        head = null;
        size = 0;
    }

    public void push(int num) {
        // here there is not issues we the specific sizes so we don't have to thought
        // about it

        Node temp = new Node(num);

        temp.next = head; // it covers both the cases , when the stack is empty or have some value
                          // if its empty ===:> the head will point to temp , and temp to null
                          // if it has some value , head will point to newly created temp and temp to the
                          // previous value
        head = temp;

        size++;

    }

    public void pop() {
        if (size == 0 || head == null) {
            // there is nothing to delete
            System.out.println("There is nothing to remove");
            System.exit(-1);
        }

        head = head.next;
        size--;
    }

    public void top() {

        if (size == 0 || head == null) {
            System.exit(-1);
        }

        System.out.println("top is " + head.val);
    }

    public boolean isEmpty() {

        return (size == 0);
    }

    public static void main(String[] args) {

        Scanner scn = Scanner(System.in);

        ImplementStackUsingLL stack = new ImplementStackUsingLL();

        String[] commands = { "LinkedListStack", "push", "push",
                "pop", "top", "isEmpty" };

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "push":

                    System.out.println("Enter the number ");
                    int val = scn.nextInt();

                    stack.push(val);
                    break;

                case "pop":

                    stack.pop();
                    break;

                case "top":

                    stack.top();
                    break;

                case "isEmpty":
                    stack.isEmpty();
                    break;
            }
        }

    }
}
