package Collection;

import java.util.HashSet;

public class HashSetMethod
{
    HashSet<Integer> hashSet = new HashSet<Integer>();

    public void addAction()
    {
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(2);
    }

    public void display()
    {
        for (Integer i : hashSet)
        {
            System.out.println(i);
        }
    }
}
