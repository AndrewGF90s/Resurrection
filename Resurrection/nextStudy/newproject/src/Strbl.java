import java.util.Scanner;

public class Strbl {
    public static void main(String[] args) {
        System.out.println("Введите число строк");
        int count   = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=count*2 ; i++) {
            sb.append("c1").append("c2");


        }
        System.out.println(sb);
    }

}
