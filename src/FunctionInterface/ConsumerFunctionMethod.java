package FunctionInterface;

import java.util.function.Consumer;

public class ConsumerFunctionMethod
{
    public static void main(String[] args)
    {
        doConsumer((s) -> { System.out.println(s); });
        doTwoConsumer(
                (s)->{System.out.println(s.toLowerCase());},
                (s)->{System.out.println(s.toUpperCase());}
                );

        String[] arr = {"张三,男","李四,女","王五,男"};
        printDate(
                (s) -> {System.out.print("姓名:"+s.split(",")[0]);},
                (s)->{System.out.println(" 性别:"+s.split(",")[1]);},
                arr);
    }

    public static void doConsumer(Consumer<String> consumer)
    {
        consumer.accept("consumer");
    }

    public static void doTwoConsumer(Consumer<String> consumer1,Consumer<String> consumer2)
    {
        consumer1.andThen(consumer2).accept("consumer And Then");
    }

    public static void printDate(Consumer<String> consumer1,Consumer<String> consumer2,String[] array)
    {
        for (String s : array)
        {
            consumer1.andThen(consumer2).accept(s);
        }
    }
}
