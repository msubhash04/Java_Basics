package fileio;

import java.io.File;
import java.io.FileReader;

public class ReadDataFromFile {
    public static void main(String[] args) {
        String pathFile = "E:\\SUBHASH\\SUBHASH_JAVA_2.5YEARS\\JAVA\\FILESIO\\details.txt";
        FileReader reader = null;
        try{
            File file = new File(pathFile);
            reader = new FileReader(file);

            int ch = reader.read();

            while(ch!=-1)
            {
                System.out.println(ch+"  ===   "+(char)ch);
                ch = reader.read();
            }

        } catch (Exception e) {
            System.out.println("Exception occured in the ReadDataFromFile "+e.toString());
        }

    }
}
