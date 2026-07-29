package fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataTofile {
    public static void main(String[] args) {
        String path = "E:\\SUBHASH\\SUBHASH_JAVA_2.5YEARS\\JAVA\\FILESIO\\details.txt";
        FileWriter  writer = null;
        try{
            File file = new File(path);
            System.out.println(file.exists());
            if (!file.exists()){
                file.createNewFile();
            }
            System.out.println(file.exists());

            writer = new FileWriter(file, true);

            writer.write("Hello Raghu \n How are You ?");
            writer.write(100);
            writer.write("\n");
            writer.write("HHHHHHHHHHHHHHHHHHHHHHHHHHHHH");


        } catch (Exception e) {
            System.out.println("Exception occured in the WriteDataToFile class "+e.toString());
        }finally {
            try{
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
