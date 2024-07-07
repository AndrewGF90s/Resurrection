import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        int[]array1 = new int[]{9,4,8,3,1,9,4,8,3,1,9,4,8,3,1};
        PrintArr(sort(array1));
    }
    public static int[] sort(int[] array) throws IOException {
          boolean isSorted =false;
          Logger logger = Logger.getLogger(BubbleSort.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("1.txt");
        logger.addHandler(fh);
        SimpleFormatter sp = new SimpleFormatter();
        fh.setFormatter(sp);

        logger.addHandler(ch);
        ch.setFormatter(sp);
         int temp =0;
         while (!isSorted){
             isSorted= true;
             logger.info("попытка");
             for (int i = 1; i <array.length ; i++) {
                 if (array[i]<array[i-1]) {
                     temp =array[i];
                     array[i]=array[i-1];
                     array[i-1]=temp;
                     logger.info("замена");
                     isSorted=false;
                 }

             }
         }

        return array;

    }
    public  static void PrintArr(int[] arr) {
        System.out.print('[');
        for(int item :arr) {
            System.out.print(item + ",");

        }
        System.out.print(']');
    }
}
