package FileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMethod
{
    public static void main(String[] args) throws IOException {
        //writeAction();
        readAction();
    }

    public static void writeAction() throws IOException
    {
        FileWriter fileWriter = new FileWriter("src/FileWriter/makeFile.txt");
        fileWriter.write("创建一个FileWriter文件");
        fileWriter.flush();
        fileWriter.close();
    }

    public static void readAction() throws IOException {
        FileReader fileReader = new FileReader("src/FileWriter/makeFile.txt");
        char[] c = new char[1024];
        int len = 0;
        while ((len = fileReader.read(c))!= -1)
        {
            System.out.println(len);
            System.out.println(new String(c,4,len));
        }
        fileReader.close();
    }
}
