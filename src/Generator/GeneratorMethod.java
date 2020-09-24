package Generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GeneratorMethod<T>
{
    private T name;

    public T get()
    {
        return name;
    }

    public void set(T s)
    {
        this.name = s;
    }


    public <M> void getClassLoader(M m)
    {
        System.out.println(m.getClass().getName());
    }

    public void forCollection(Collection<?> collection)
    {
        for (Object o : collection)
        {
            System.out.println(o);
        }
    }
}
