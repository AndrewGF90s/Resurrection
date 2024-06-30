import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        System.out.println("Add number");
        int num1 =scr();
        System.out.println("Add number");
        int num2 =scr();

        System.out.println(power(num1,num2));
    }
public static double power(int number,int pow) {
        return Math.pow(number,pow);
}
public static int  scr() {
    int in = new Scanner(System.in).nextInt();
    return in;
}
}
