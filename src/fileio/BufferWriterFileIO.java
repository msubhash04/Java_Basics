package fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterFileIO {
    public static void main(String[] args) {
        String path = "E:\\SUBHASH\\SUBHASH_JAVA_2.5YEARS\\JAVA\\FILESIO\\buffwrit.txt";
        FileWriter writer = null;
        BufferedWriter buffWriter = null;

        try{
            File file = new File(path);
            writer = new FileWriter(file);
            buffWriter = new BufferedWriter(writer);

            if(!file.exists())
            {
                file.createNewFile();
            }

            buffWriter.write("Hey ");
            buffWriter.newLine();
            buffWriter.write(67);
            buffWriter.newLine();
            char[] chArr = {'A',' ','E',' ','I',' ','O',' ','U'};
            buffWriter.write("======== Vowels in the English ========");
            buffWriter.newLine();
            buffWriter.write(chArr);

        } catch (Exception e) {
            System.out.println("Exception occured in the BufferWriterFileIO  "+e.toString());
        }finally {
            try {
                buffWriter.flush();
                buffWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
