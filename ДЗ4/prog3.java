package ДЗ4;

import java.util.Iterator;
import java.util.LinkedList;

public class prog3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(6);
        list.add(12);
        list.add(99);
        list.add(3);
        list.add(21);

        Iterator iterator = list.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            sum += (int) iterator.next();
        }
        System.out.println(sum);

    }
}
