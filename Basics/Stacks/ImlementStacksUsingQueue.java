package Basics.Stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ImlementStacksUsingQueue {

    Queue<Integer> q;

    public ImlementStacksUsingQueue() {

        q = new LinkedList<>();
    }

    void push(int x) {

        q.add(x);
        int size = q.size();

        for (int i = 0; i < size - 1; i++) {
            q.add(q.poll()); // ultimately its just a swap , but how logically , "BEAUTIFUL"
        }
    }

    void pop() {
        if (q.isEmpty()) {
            System.out.println("There is nothing to pop");
            return;
        }
        q.poll();
    }

    void peek() {
        System.out.println("Peek " + q.peek());
    }

    boolean isEmpty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {

        ImlementStacksUsingQueue q = new ImlementStacksUsingQueue();
        Scanner scn = new Scanner(System.in);
        String[] commands = {
                "push", "push", "push", "peek", "pop", "pop", "isEmpty"
        };

        for (int i = 0; i < commands.length; i++) {

            switch (commands[i]) {
                case "push":

                    int x;
                    System.out.print("Enter the elemnt you wanted to push : +");
                    x = scn.nextInt();
                    q.push(x);
                    System.out.println(q.q);
                    break;

                case "peek":
                    q.peek();
                    System.out.println(q.q);

                    break;

                case "pop":

                    q.pop();
                    System.out.println(q.q);

                    break;

                case "isEmpty":

                    q.isEmpty();
                    System.out.println(q.q);

                    break;

                default:
                    break;
            }
        }
    }
}
