package Basics.Stacks;

import java.util.*;

public class ImplementQueueUsingArrays {

    int capacity;
    int[] queue;
    int start;
    int end;
    int size;

    public ImplementQueueUsingArrays(int capacity, int[] queue) {
        this.capacity = capacity;
        this.queue = queue;
        this.start = -1;
        this.end = -1;
        this.size = 0;
    }

    int push(int num) {

        // if queue is full
        if (size == capacity) {
            System.out.println("Queue is full  \n Exiting...");
            System.exit(-1);
        }

        // if queue is empty
        if (end == -1) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % capacity;
        }

        queue[end] = num;
        size++;
        System.out.println("element to be inserted " + num);
        return queue[end];

    }

    int dequeue() {

        // if queue is empty
        if (size == 0) {
            System.out.println("Nothing to Deque , \n exiting...");
            System.exit(1);
        }

        int popped = queue[start];
        // if queue has only one element reset the queue
        if (size == 1) {
            start = -1;
            end = -1;
        } else {
            queue[start] = 0;
            start = (start + 1) % capacity;
        }

        size--;
        return popped;

    }

    boolean isEmpty() {
        System.out.println("IS EMPTY " + (size == 0));
        return (size == 0);
    }

    int peek() {

        if (size == 0) {
            System.out.println("Queue is Empty");
            System.exit(-1);
        }
        System.out.println("PEEK ELEMENT " + queue[start]);
        return queue[start];
    }

    public static void main(String[] args) {

        int capacity = 10;
        int[] arr = new int[capacity];
        Scanner scn = new Scanner(System.in);

        ImplementQueueUsingArrays queue = new ImplementQueueUsingArrays(capacity, arr);

        String[] commands = { "push", "push",
                "peek", "pop", "isEmpty" };

        for (int i = 0; i < commands.length; i++) {

            switch (commands[i]) {
                case "push":

                    System.out.println("Enter the element to push ");
                    int val = scn.nextInt();
                    queue.push(val);
                    System.out.println(Arrays.toString(queue.queue));
                    break;

                case "pop":

                    int ele = queue.dequeue();
                    System.out.println("Element to be delete " + ele);
                    System.out.println(Arrays.toString(queue.queue));

                    break;

                case "isEmpty":

                    queue.isEmpty();
                    System.out.println(Arrays.toString(queue.queue));

                    break;
                case "peek":

                    System.out.print(queue.peek());
                    System.out.println(Arrays.toString(queue.queue));

                    break;
            }
        }

    }

}
