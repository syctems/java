package InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Timer;

public class InputStreamMethod
{
    public static void main(String[] args) throws IOException {
        readAction();
        readAction2();
        readAction3();
        copyAction();
    }

    public static void readAction() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/InputStream/c.txt");
        int b ;
        while ((b = fileInputStream.read()) != -1)
        {
            System.out.println((char)b);
        }
        fileInputStream.close();
    }

    public static void readAction2() throws IOException
    {
        long old = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("src/InputStream/a.txt");
        int b ;
        while ((b = fileInputStream.read()) != -1)
        {
            System.out.print((char)b);
        }
        fileInputStream.close();
        long now = System.currentTimeMillis();
        System.out.println("方法运行的时间:"+ (now - old));
    }

    public static void readAction3() throws IOException
    {
        long old = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("src/InputStream/a.txt");
        int b ;
        byte[] l = new byte[2];
        while ((b = fileInputStream.read(l)) != -1)
        {
            System.out.print(new String(l,0,b));
        }
        fileInputStream.close();
        long now = System.currentTimeMillis();
        System.out.println("方法运行的时间:"+ (now - old));
    }

    public static void copyAction() throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream("src/InputStream/a.txt");

        FileOutputStream fileOutputStream = new FileOutputStream("src/InputStream/copy.txt");
        int len;
        byte[] l = new byte[1024];
        while ((len = fileInputStream.read(l))!= -1)
        {
            fileOutputStream.write(l,0,len);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }

}
