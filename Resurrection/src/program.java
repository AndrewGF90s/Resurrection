import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Введите имя");
        String name = scr.nextLine();
        System.out.printf("Сколько тебе лет?");
        boolean test  = scr.hasNextInt();
        int age = scr.nextInt();
            System.out.print(name  +"  Ты молодец!" + " Скоро тебе будет уже " + (age + 1) +"  Пора рости!!!" );

//        System.out.println("Привет " + name + "!!!");


    }



}
