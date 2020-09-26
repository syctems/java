package Collection;

import java.util.ArrayList;

public class ArrayListMethod
{
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public void addAction()
    {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
    }

    public void removeAction()
    {
        arrayList.remove(4);
    }

    public Integer getAction()
    {
        return arrayList.get(0);
    }

    public void setAction()
    {
        arrayList.set(2,10);
    }

    public void display()
    {
        for(Integer i : arrayList)
        {
            System.out.println(i);
        }
    }
}
