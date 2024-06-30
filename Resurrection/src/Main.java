import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Program.realtime());
        Scanner scanner = new Scanner(System.in);
        System.out.println("That is your name ?");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name);
    }
}