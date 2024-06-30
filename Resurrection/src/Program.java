import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
//        System.out.print("Введите имя");
//        String name = scr.nextLine();
//        System.out.printf("Сколько тебе лет?");
//        boolean test  = scr.hasNextInt();
//        int age = scr.nextInt();
//            System.out.print(name  +"  Ты молодец!" + " Скоро тебе будет уже " + (age + 1) +"  Пора рости!!!" );
        System.out.print(realtime());
//        System.out.println("Привет " + name + "!!!");


    }
public static LocalDateTime realtime() {
    DateTimeFormatter nameFormater = DateTimeFormatter.ofPattern("дата: dd.MM.yyyy время : hh ч. mm  мин. ss сек.");
    System.out.print(nameFormater.format(LocalDateTime.now()));
    return LocalDateTime.now();
}


}
