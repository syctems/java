package Property;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertyMethod
{
    public static void main(String... args) throws IOException {
//        propertyAction();
//        storeAction();
        loadAction();
    }

    public static void propertyAction()
    {
        Properties properties = new Properties();
        properties.setProperty("fileName","a.txt");
        properties.setProperty("size","109498");
        properties.setProperty("location","d:/");

        System.out.println(properties);
        System.out.println(properties.getProperty("size"));

        Set<String> names = properties.stringPropertyNames();
        for(String s : names)
        {
            System.out.println(s + ":" + properties.getProperty(s));
        }
    }


    public static void storeAction() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("fileName","a.txt");
        properties.setProperty("size","109498");
        properties.setProperty("location","d:/");
        properties.store(new FileWriter(new File("src/Property/p.txt")),"aa");
    }

    public static void loadAction() throws IOException {
        Properties p1=new Properties();
        p1.load(new FileReader(new File("src/Property/p.txt")));

        Set<String> names = p1.stringPropertyNames();
        for(String s : names)
        {
            System.out.println(s + ":" + p1.getProperty(s));
        }
    }
}
