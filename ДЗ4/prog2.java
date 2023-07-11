package ДЗ4;

import java.util.LinkedList;
import java.util.Queue;

//        Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.
public class prog2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(43);
        queue.add(2);
        queue.add(76);
        System.out.println(queue);
        // MyQueue.enqueue(queue, 2);
        System.out.println(MyQueue.dequeue(queue));
        // System.out.println(MyQueue.first(queue));
        System.out.println(queue);
        

    }
}
