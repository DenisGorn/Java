import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите первое число: ");
        double numOne = in.nextInt();
        System.out.println("Ведите второе число: ");
        double numTwo = in.nextInt();
        System.out.println("Ведите арифметическое действие(+, -, *, /): ");
        char operation = in.next().charAt(0);
        double result;
        switch (operation){
            case '+':
                result = numOne+numTwo;
                break;
            case '-':
                result = numOne-numTwo;
                break;
            case '*':
                result = numOne*numTwo;
                break;
            case '/':
                result = numOne/numTwo;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                    return;
        }
        System.out.println(numOne + " " + operation + " " + numTwo + " = " + result); 
    }
}

