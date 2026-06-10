package Basics.Stacks;

import java.util.*;

public class ImplementStackUsingArrays {

    int capacity;
    int[] stack;
    int top;

    public ImplementStackUsingArrays(int capacity, int[] stack, int top) {
        this.capacity = capacity;
        this.stack = stack;
        this.top = top;
    }

    int top() {

        if (isEmpty()) {
            return -1;
        }

        return stack[top];
    }

    int push(int num) {

        if (top < capacity - 1) {
            top++;
            stack[top] = num;
        }
        return stack[top];
    }

    void pop() {

        if (isEmpty()) {
            System.out.println("No element is found to remove a element ");
        }
        System.out.println("Element which is popped out is " + stack[top]);
        stack[top] = 0;
        top--;

    }

    boolean isEmpty() {

        return top < 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int capacity = 5;
        int top = -1;
        ImplementStackUsingArrays stack = new ImplementStackUsingArrays(capacity, new int[capacity], top);

        String[] functions = { "push", "push", "push", "pop", "top", "top", "pop", "isEmpty" };

        for (int i = 0; i < functions.length; i++) {

            switch (functions[i]) {
                case "push":
                    System.out.println("Enter the element to push ");
                    int ele = scn.nextInt();

                    int val = stack.push(ele);
                    System.out.println("Pushed element is " + val);

                    System.out.println(Arrays.toString(stack.stack));
                    break;

                case "pop":

                    stack.pop();
                    System.out.println(Arrays.toString(stack.stack));

                    break;

                case "top":

                    stack.top();
                    System.out.println(Arrays.toString(stack.stack));

                    break;

                case "isEmpty":

                    stack.isEmpty();
                    System.out.println(Arrays.toString(stack.stack));

                    break;

                default:
                    break;
            }
        }

    }
}