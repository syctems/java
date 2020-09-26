package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethod
{
    HashMap<String,Integer> hashMap = new HashMap<String,Integer>();

    public void addAction()
    {
        hashMap.put("a",1);
        hashMap.put("b",2);
        hashMap.put("c",3);
        hashMap.put("d",4);
    }

    public void display()
    {
        Set<String> dMap = hashMap.keySet();
        for (String d : dMap)
        {
            System.out.println("key:"+ d +" value:"+ hashMap.get(d));
        }
    }


    public void display2()
    {
        Set<Map.Entry<String,Integer>> dMap = hashMap.entrySet();
        for (Map.Entry<String,Integer> d : dMap)
        {
            System.out.println("key:"+ d.getKey() +" value:"+ d.getValue());
        }
    }
}
