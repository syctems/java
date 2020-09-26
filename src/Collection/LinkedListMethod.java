package Collection;

import java.util.LinkedList;

public class LinkedListMethod
{
    LinkedList<String> linkedList = new LinkedList<String>();

    public void addFirstAction()
    {
        linkedList.addFirst("张三");
        linkedList.addFirst("李四");
        linkedList.addFirst("王五");
    }

    public void display()
    {
        for (String s : linkedList)
        {
            System.out.println(s);
        }
    }

    public String getFirstAction()
    {
        return linkedList.getFirst();
    }

    public String getLastAction()
    {
        return linkedList.getLast();
    }

    public String removeFirstAction()
    {
       return linkedList.removeFirst();
    }

    public String removeLastAction()
    {
        return linkedList.removeLast();
    }

    public void getLink()
    {
        while (!linkedList.isEmpty())
        {
            System.out.println(linkedList.pop());
        }
    }
}
