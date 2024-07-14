import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Реализуйте метод, который принимает на вход целочисленный массив arr:
//        - Создаёт список ArrayList, заполненный числами из исходого массива arr.
//        - Сортирует список по возрастанию и выводит на экран.
//        - Находит минимальное значение в списке и выводит на
//        экран - Minimum is {число} - Находит максимальное значение в списке и выводит на
//        экран - Maximum is {число}
//        - Находит среднее арифметическое значений списка и выводит на экран - Average is =
//        {число}
//Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает
//на вход один параметр:
//
//Integer[] arr - массив целых чисел.
//
//        Пример.
//Исходный массив:
//
//        4, 2, 7, 5, 1, 3, 8, 6, 9
public class ListBubble {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        int sum =0;
        System.out.println(Bubble11(arr));
        int min = Collections.min(Bubble11(arr));
        int max = Collections.max(Bubble11(arr));
        for (int item : arr) {
            sum  += item;
                    }
        int avarege = sum / arr.length;
        System.out.println(avarege);


    }

    public static ArrayList<Integer> Bubble11(Integer[] arrays) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(arrays));
        boolean swicher = false;
        while (!swicher) {
            swicher = true;
            for (int i = 1; i < array.size(); i++) {
                if (array.get(i) < array.get(i - 1)) {
                    int temp = array.get(i);
                    array.set(i, array.get(i - 1));
                    array.set(i - 1, temp);
                    swicher = false;
                }

            }
        }
        return array;
    }
}
