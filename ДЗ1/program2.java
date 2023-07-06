// 2) Вывести все простые числа от 1 до 1000
public class program2 {
    public static void main(String[] args) {
        System.out.println("Простые числа: ");

        for (int i = 2; i < 1000; i++) {
            int x = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0)
                    x++;
            }
            if (x <= 2)
                System.out.println(i);
 
        }
    }
 }