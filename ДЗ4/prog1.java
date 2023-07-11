package ДЗ4;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


//        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
//        Постараться не обращаться к листу по индексам.
public class prog1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(12);
        list.add(4);
        list.add(25);
        System.out.println(list);

        Stack<Integer> stack = new Stack<>();
        stack.addAll(list);
        list.clear();
        while (!stack.empty()) {
            list.add(stack.pop());
        }
        System.out.println(list);
    }
}
