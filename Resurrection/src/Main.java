import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 5, 6, 3, 7, 8, 9, 3, 3, 2, 3, 3, 1, 647, 123, 0, 213,};
        int num = 3;
        System.out.println(Arrays.toString(changeArray(array, num)));

    }

    public static int[] changeArray(int[] newArray, int number) {
        int position =0;
//        for (int i = 0; i < position; i++) {
//            if (newArray[i] == number) {
//                while (newArray[position] == number && position > i) {
//                    position--;
//
//                }
//                int temp = newArray[i];
//                newArray[i] = newArray[position];
//                newArray[position] = temp;
//                position--;
//            }
//
        for (int i =0; i < newArray.length-1; i++) {
            int temp =0;
            if (newArray[i]==number) {

                while (newArray[position] == number && newArray[i]>newArray[position]) {
                    position++;
                }
                    temp= newArray[i];
                    newArray[i]= newArray[position];
                    newArray[position]= temp;
                      position++;
                                    }


            }

        return newArray;
        }
    }




