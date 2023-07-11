package ДЗ3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prog {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {5, 7, 4, 8, 12, 5, 99, 100};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println("Список: " + list);

        list.removeIf(n -> n % 2 == 0);

        System.out.println("Список без четных чисел: " + list);
       
}
}
