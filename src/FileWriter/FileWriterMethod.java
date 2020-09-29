package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMethod
{
    public static void main(String[] args) throws IOException {
        writeAction();
    }

    public static void writeAction() throws IOException
    {
        FileWriter fileWriter = new FileWriter("src/FileWriter/makeFile.txt");
        fileWriter.write("创建一个FileWriter文件");
        fileWriter.flush();
        fileWriter.close();
    }
}
