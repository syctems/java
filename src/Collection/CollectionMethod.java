package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethod
{
    private Collection<String> collection = new ArrayList<String>();

    public CollectionMethod()
    {
        collection.add("张三");
        collection.add("李四");
        collection.add("王五");
        collection.add("赵六");
    }

    public Integer getSize()
    {
        return collection.size();
    }

    public Boolean hasContain()
    {
        return collection.contains("张龙辉");
    }

    public void clearAction()
    {
       collection.clear();
    }

    public Boolean hasEmptyAction()
    {
        return collection.isEmpty();
    }

    public Object[] toArrayAction()
    {
        return collection.toArray();
    }

    public Boolean removeAction()
    {
        return collection.remove("赵六");
    }
}
