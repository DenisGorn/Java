package ДЗ4;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    private static LinkedList queue = new LinkedList<>();

    
    public static void enqueue(Queue<Integer> queue, int num) {
        ((LinkedList) queue).addLast(num);
        ((LinkedList) queue).remove(num);
        
    }

    public static int dequeue(Queue<Integer> queue) {
        int num = (int) ((LinkedList) queue).get(0);
        queue.remove(0);
        return num;

    }

    public static int first(Queue<Integer> queue) {
        int num = (int) ((LinkedList) queue).get(0);
        return num;
    }

}
