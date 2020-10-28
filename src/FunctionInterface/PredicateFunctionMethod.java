package FunctionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionMethod
{
    public static void main(String[] args)
    {
        doSomeMethod(
                (s)->{return s.length() > 6;}
                );
        doSomeMethodTwo(
                (s)->{return  s.length() > 4;},
                (s)->{ return s.contains("h");}
                );
        doSomeMethodThree(
                (s)->{return s.length() > 3 ;},
                (s)->{return s.contains("x");}
        );
        doSomeMethodFour(
                (s) -> { return s.contains("p");}
        );

        String[] arr = {"zhangsan,nv","lisi,nan","wangwu,nv"};
        doSomeMethodFive(
                (s)-> { return s.split(",")[1].equals("nv");},
                (s)-> { return s.split(",")[0].length() > 6;},
                arr
        );
    }

    public static void doSomeMethod(Predicate<String> predicate)
    {
        System.out.println("字符串长度是否大于6？ " + predicate.test("hello"));
    }

    public static void doSomeMethodTwo(Predicate<String> predicate1,Predicate<String> predicate2)
    {
        System.out.println("字符串长度是否符合要求？ " + predicate1.and(predicate2).test("hello"));
    }

    public static void doSomeMethodThree(Predicate<String> predicate1,Predicate<String> predicate2)
    {
        System.out.println("字符串长度是否符合要求？" + predicate1.or(predicate2).test("hello"));
    }

    public static void doSomeMethodFour(Predicate<String> predicate)
    {
        System.out.println("字符串长度是否符合要求？" + predicate.negate().test("hello"));
    }

    public static List<String> doSomeMethodFive(Predicate<String> predicate1, Predicate<String> predicate2, String[] array)
    {
        List<String> arr = new ArrayList<>();
        for(String s : array)
        {
            if(predicate1.and(predicate2).test(s))
            {
                arr.add(s);
            }
        }
        System.out.println(arr);
        return arr;
    }
}
