// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! 
// (произведение чисел от 1 до n)

import java.util.Scanner;

/**
 * 1
 */
public class program1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int num = in.nextInt();
        System.out.println("Сумма чисел от 1 до " + num + " = " + sum(num));
        System.out.println("Произведение чисел от 1 до " + num + " = " + mult(num));
    }
    public static int sum(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    } 

    public static int mult(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    } 
}