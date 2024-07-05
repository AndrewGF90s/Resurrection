import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

public class GetFileNames {
    private static final Logger logger = Log.log(GetFileNames.class.getName());
    public GetFileNames(String path) {




//        System.out.println(Arrays.toString(GetfileName(".")));
        WriteToFile("Task2",".");
    }
    private static String[] GetfileName (String path) {
        File fl =new File(path);
        String[] result = new String[0];
        if(fl.isFile()) {
            throw new RuntimeException(" Файл не является файлом!");
        }
        else {
            File[] fileArr = fl.listFiles();
            result = new String[fileArr.length];
            for (int i = 0; i <result.length ; i++) {
                result[i] = fileArr[i].getName();

            }

        }
        return result;
    }
    private static void WriteToFile(String path,String pathOut){
        try {
            FileWriter fw = new FileWriter(path);
            String[] names = GetfileName(pathOut);
            for(String st: names) {
                fw.write(fw+"\n");
            }
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
