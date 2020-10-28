package Reflect;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReflectClass<T>
{
    public T o;

    public void takeMod() throws IllegalAccessException {
        Map<String, ArrayList<String>> result = getAnnoValue(o);
        for(Map.Entry<String, ArrayList<String>> entry : result.entrySet()) {
            if(checkAnnoKey(o,entry.getKey()))
            {
                setAnnoValue(o,entry.getValue());
            }
        }
    }

    public  Map<String, ArrayList<String>> getAnnoValue(T o)
    {
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        Class<?> printClass = o.getClass();
        Field[] fields = printClass.getDeclaredFields();
        for (Field f : fields)
        {
            boolean annotationPresent = f.isAnnotationPresent(TestAnno.class);
            if (annotationPresent) {
                TestAnno methodAnno = f.getAnnotation(TestAnno.class);
                String[] arr = methodAnno.list();
                String name = methodAnno.name();
                ArrayList<String> arrayList = new ArrayList<String>();
                for (String s : arr)
                {
                    arrayList.add(s);
                }
                map.put(name,arrayList);
            }
        }
        return map;
    }

    public  boolean checkAnnoKey(T o,String name) throws IllegalAccessException {
        Class userCla = o.getClass();
        Field[] fs = userCla.getDeclaredFields();
        for(int i = 0 ; i < fs.length; i++){
            Field f = fs[i];
            f.setAccessible(true);
            String val = f.get(o).toString();
            if(f.getName().equals(name) && val == "0")
            {
                return true;
            }
        }
        return false;
    }


    public  void setAnnoValue(T o,ArrayList<String> arrayList) throws IllegalAccessException {
        Class userCla = o.getClass();
        Field[] fs = userCla.getDeclaredFields();
        for(int i = 0 ; i < fs.length; i++){
            Field f = fs[i];
            f.setAccessible(true);
            if(arrayList.contains(f.getName()))
            {
                f.set(o,"");
            }
        }
    }
}
