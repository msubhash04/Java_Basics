package fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferReaderIO {
    public static void main(String[] args) {
        String path = "E:\\SUBHASH\\SUBHASH_JAVA_2.5YEARS\\JAVA\\FILESIO\\buffwrit.txt";
        FileReader reader = null;
        BufferedReader buffReader = null;

        try{
            File file = new File(path);
            reader = new FileReader(file);
            buffReader = new BufferedReader(reader);
            String str = buffReader.readLine();
            

        } catch (Exception e) {
            System.out.println("Exception occured in the BufferReaderIO "+e.toString());
        }
    }
}
