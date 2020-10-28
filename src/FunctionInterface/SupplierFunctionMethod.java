package FunctionInterface;

import java.util.function.Supplier;

public class SupplierFunctionMethod
{
    public static void main(String[] args)
    {
        String s1 = "hello";
        String s2 = "world";
        doString(()->{
            String s  = s1 + s2;
            System.out.println(s);
            return s;
        });
        int[] arr = {1,21,35,4,57,69};

        int result =doString2(()->{
            int max = 0;
            for (int i : arr)
            {
                if(i>max)
                {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(result);
    }

    public static String doString(Supplier<String> stringSupplier)
    {
        return stringSupplier.get();
    }

    public static Integer doString2(Supplier<Integer> stringSupplier)
    {
        return stringSupplier.get();
    }
}
