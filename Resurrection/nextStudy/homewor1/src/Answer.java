import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        System.out.println("Введите число для УТРЕУГОЛЬНЕНИЯ ");
        int num = new Scanner(System.in).nextInt();


        System.out.println("результат будет равен " +countTriagleN(num));
    }

    public static int countTriagleN(int number) {
        if (number<1)
            return-1;
        int answ = 0;
        for (int i = 0; i <= number; i++) {
            answ += i;
        }
        return answ;

    }
}
