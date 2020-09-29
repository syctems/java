package FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMethod
{
    public static void main(String[] args) throws IOException {
        readAction();
        readAction2();
    }

    public static void readAction() throws IOException
    {
        FileReader fileReader = new FileReader("src/FileReader/a.txt");
        int len;
        while ((len = fileReader.read()) != -1)
        {
            System.out.println((char)len);
        }
        fileReader.close();
    }

    public static void readAction2() throws IOException {
        FileReader fileReader = new FileReader("src/FileReader/a.txt");
        int len;
        char[] cbuf = new char[1024];
        while ((len = fileReader.read(cbuf)) != -1)
        {
            System.out.println(new String(cbuf,0,len));
        }
        fileReader.close();
    }
}
