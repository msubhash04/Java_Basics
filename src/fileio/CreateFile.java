package fileio;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        String dirPath = "E:\\SUBHASH\\SUBHASH_JAVA_2.5YEARS\\JAVA\\FILESIO";
        String filePath = "details.txt";

        File file = new File(dirPath);
        System.out.println(file.exists());
        System.out.println(file.getPath());
        System.out.println(file.delete());

        File file1 = new File(dirPath+"\\"+filePath);

        System.out.println(file1.exists());
        if(!file1.exists()){
            file1.createNewFile();
        }
        System.out.println(file1.exists());

//        System.out.println(file1.delete());
    }
}
