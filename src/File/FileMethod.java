package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileMethod
{
    public static void main(String[] args) throws IOException {
        createFile();
    }

    public static void createFile() throws IOException {
//        File file = new File("d:/a.txt");
//        System.out.println("file的绝对路径："+file.getAbsolutePath());
//        System.out.println("file的字符串路径："+file.getPath());
//        System.out.println("file的名称："+file.getName());
//        System.out.println("file的名称："+file.length());
        File file2 = new File("src/File/test/b.txt");
        System.out.println("file2的绝对路径："+file2.getAbsolutePath());
        System.out.println("file2的字符串路径："+file2.getPath());
        System.out.println("file2的名称："+file2.getName());
        System.out.println("file2的名称："+file2.length());


        System.out.println("==================");
        checkFileOrDirctory(file2);
        System.out.println("==================");
        displayDirctoryAndFile(new File("src"));
        System.out.println("==================");
        deleteFileOrDirctory();
        System.out.println("==================");
        //makeFileOrDirctory();
    }

    public static boolean checkFileOrDirctory(File file)
    {
        if(!file.exists())
        {
            System.out.println("文件路径不正确");
            return false;
        }
        if(file.isFile()||file.isDirectory())
        {
            System.out.println("这是一个文件或目录,它的大小是:"+file.length());
            return true;
        }else{
            System.out.println("这不是一个文件或目录");
            return false;
        }
    }

    public static void displayDirctoryAndFile(File file)
    {
        for(File f : file.listFiles())
        {
            if(f.isDirectory())
            {
                System.out.println("目录"+f.getAbsolutePath()+"下的文件:");
                displayDirctoryAndFile(f);
            }else {
                System.out.println("文件名:"+f.getAbsolutePath());
            }

        }
    }

    public static void makeFileOrDirctory() throws IOException
    {
        File file = new File("src/File/test2/a.txt");
        file.createNewFile();

        new File("src/File/mk").mkdir();

        new File("src/File/ms/oo").mkdirs();
    }

    public static void deleteFileOrDirctory()
    {
        new File("src/File/ms/oo").delete();
        new File("src/File/test2/a.txt").delete();
    }
}
