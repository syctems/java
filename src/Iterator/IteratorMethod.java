package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorMethod
{
    private Collection<Integer> collection = new ArrayList<Integer>();

    public IteratorMethod()
    {
        collection.add(1);
        collection.add(2);
        collection.add(3);
    }


    public void display()
    {
       Iterator<Integer> iterator =  collection.iterator();
       while(iterator.hasNext())
       {
           Integer i = iterator.next();
           System.out.println(i);
       }
    }

    public void display2()
    {
        for(Integer i : collection)
        {
            System.out.println(i);
        }
    }
}
