package FunctionInterface;

import java.util.function.Function;

public class FunctionMethod
{
    public static void main(String[] args)
    {
        doMethodOne(
                (s)->{ return Integer.parseInt(s);}
        );
        doMethodTwo(
                (s)->{ return Integer.parseInt(s) + 10 ;},
                (s)->{ return  s *= 10;}
        );
    }

    public static void doMethodOne(Function<String,Integer> function)
    {
        int num = function.apply("10");
        System.out.println("num:"+ (num + 20));
    }

    public static void doMethodTwo(Function<String,Integer> function1,Function<Integer,Integer> function2)
    {
        int num = function1.andThen(function2).apply("10");
        System.out.println("num:"+ num);
    }
}
