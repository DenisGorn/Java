package ДЗ3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//  Пусть дан произвольный список целых чисел, удалить из него четные числа



public class prog1 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {5, 7, 4, 8, 12, 5, 99, 100};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println("Список: " + list);
        System.out.println("Минимальное число: " + Collections.min(list));
        System.out.println("Максимальное число: " + Collections.max(list));
        int result = 0;
        for (int item : list) {
            result += item;
        }

        System.out.println("Среднее арифметическое: " + result / list.size());

        
    }

}

    


