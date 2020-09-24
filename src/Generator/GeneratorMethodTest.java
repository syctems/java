package Generator;

import java.util.ArrayList;
import java.util.Collection;

public class GeneratorMethodTest
{
    public static void main(String[] args)
    {
        GeneratorMethod<Integer> generatorMethod1 = new GeneratorMethod<Integer>();
        generatorMethod1.set(1);
        System.out.println("泛型的name:"+generatorMethod1.get());

        GeneratorMethod<String> generatorMethod2 = new GeneratorMethod<String>();
        generatorMethod2.set("zhangsan");
        System.out.println("泛型的name:"+generatorMethod2.get());

        generatorMethod1.getClassLoader(1);
        generatorMethod1.getClassLoader("22");

        Collection<String> collection = new ArrayList<String>(2);
        collection.add("11");
        collection.add("22");
        collection.add("33");

        generatorMethod1.forCollection(collection);

        Collection<Integer> collection1 = new ArrayList<Integer>(2);
        collection1.add(44);
        collection1.add(55);
        collection1.add(66);

        generatorMethod1.forCollection(collection1);
    }
}
