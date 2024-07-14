import java.util.ArrayList;
import java.util.Arrays;

//
//Дан произвольный массив целых чисел. Создайте список ArrayList,
//заполненный данными из этого массива. Необходимо удалить из
//списка четные числа и вернуть результирующий.
//
//Напишите свой код в методе removeEvenNumbers класса Answer.
//Метод removeEvenNumbers принимает на вход
//один параметр: Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>
//
//Примеры.
//Исходный массив:
//
//        1, 2, 3, 4, 5, 6, 7, 8, 9
public class Answer {
    public static void main(String[] args) {
Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
remuveEvenNumbers(array);
    }
    public static void remuveEvenNumbers(Integer[] arr) {
        ArrayList<Integer> newArr = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i <newArr.size() ; i++) {
            if(newArr.get(i)%2 ==0) {
                newArr.remove(i);
                i--;
            }

        }
//        for (Integer integer : arr) {
//            if (integer % 2 != 0) {
//                newArr.add(integer);
//            }
//
//
//        }
        System.out.println(newArr);
    }
}
