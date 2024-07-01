import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        System.out.println("Введите число для УС/" +
                "ТРЕУГОЛЬНЕНИЯ ");
        int  num = new Scanner(System.in).nextInt();
        System.out.println(countTriagleN(num));
    }
    public static int countTriagleN(int number) {
        int answ =0;

        for (int i = 0; i <= number; i++) {
             answ += i;
        }
        return answ;

    }
}
