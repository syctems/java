package OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamMethod
{
    public static void main(String[] args) throws IOException {
        writeAction();
        writeByteAction();
        writeByteAction2();
        appendAction();
        displayAction();
    }

    public static void writeAction() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/OutputStream/a.txt");
        fileOutputStream.write(97);
        fileOutputStream.write(97);
        fileOutputStream.write(97);
        fileOutputStream.close();
    }

    public static void writeByteAction() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/OutputStream/b.txt");
        byte[] context = "文件名：b.txt".getBytes();
        fileOutputStream.write(context);
        fileOutputStream.close();
    }

    public static void writeByteAction2() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/OutputStream/c.txt");
        byte[] context = "c.txt".getBytes();
        fileOutputStream.write(context,2,3);
        fileOutputStream.close();
    }


    public static void appendAction() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/OutputStream/c.txt",true);
        byte[] context = ",appendContext".getBytes();
        fileOutputStream.write(context);
        fileOutputStream.close();
    }

    public static void displayAction() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/OutputStream/d.txt");
        byte[] context = "appendContext".getBytes();
        for(int i = 0; i < context.length; i++)
        {
            fileOutputStream.write(context[i]);
            fileOutputStream.write("\r\n".getBytes());
        }
        fileOutputStream.close();
    }
}
