import java.util.Scanner;

public class Calculator11 {
    public static void main(String[] args) {
        System.out.println("Введите число ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Введите число ");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("Введите  операцию ");
        char oper = new Scanner(System.in).next().charAt(0);
        if (oper == '/' && num1 == 0 || num2 == 0) {
            System.out.println("На 0 делить нельзя!");
        } else {
            System.out.println(Calculator(oper, num1, num2));
        }
    }

    public static double Calculator(char op, int a, int b) {
        double result = 0;
        switch (op) {
            case '-':
                result = a - b;
                break;
            case '+':
                result = a + b;
                break;
            case '/':
                result = a / b;
                break;
            case '*':
                result = a * b;
                break;
            default:
                System.out.println("Вы ввели некорректное значение!");

        }
        return result;
    }
}

