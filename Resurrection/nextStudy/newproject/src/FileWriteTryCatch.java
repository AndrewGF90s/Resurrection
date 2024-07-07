import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTryCatch {
    public static void main(String[] args) throws IOException {
//        StringBuilder str = new StringBuilder();
//        for (int i = 0; i < 1_000_000; i++) {
//            str.append("+");
//        }
        try {
            FileReader fr = new FileReader("test.txt");
            System.out.println(" readed");
        } catch (FileNotFoundException e) {
            try { FileWriter writer = new FileWriter("error.txt",true);
                writer.write("you here because, we have a mistake\n");
                writer.flush();
            } catch (IOException ex) {
                System.out.println("2 catch ");
            }
        }
    }
}