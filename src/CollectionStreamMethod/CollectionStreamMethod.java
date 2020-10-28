package CollectionStreamMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionStreamMethod
{
    public static void main(String[] args)
    {
        //doSomeMethodOne();
        //doSomeMethodTwo();
        //doSomeMethodThree();
        //doSomeMethodFour();
        //doSomeMethodFive();
        doSomeMethodSix();
    }

    public static void doSomeMethodOne()
    {
        String[] arr = {"zhangsan","lisi","wangwu"};
        Stream<String> stream = Stream.of(arr);
        stream.forEach((s)->{ System.out.println(s);});
    }

    public static void doSomeMethodTwo()
    {
        String[] arr = {"zhangsan","lisi","wangwu"};
        Stream.of(arr).filter((s)->{ return s.startsWith("zhang");}).forEach((s) -> { System.out.println(s);});
    }

    public static void doSomeMethodThree()
    {
        String[] arr = {"10","20","30"};
        Stream.of(arr).map((s)->{ return Integer.parseInt(s) + 10;}).forEach((s) -> { System.out.println(s);});
    }

    public static void doSomeMethodFour()
    {
        String[] arr = {"zhangsan","lisi","wangwu"};
        Stream<String> stream = Stream.of(arr).filter((s) -> { return s.contains("a"); });
        System.out.println(stream.count());
    }

    public static void doSomeMethodFive()
    {
        Map<String,String> params = new HashMap<>(16);
        params.put("a","");
        params.put("b","1");
        params.put("ac","c");


        Map<String, String> a = params.entrySet().stream()
                .filter((s) -> { return s.getKey().contains("a"); })
                .collect(Collectors.toMap((e) -> { return e.getKey(); }, (e) -> { return e.getValue(); }));
        System.out.println(a);
    }

    public static void doSomeMethodSix() {
        class Person {
            private String name;

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        '}';
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Person(String n) {
                this.name = n;
            }

        }
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星");
        one.add("石破天");
        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");

        Stream<String> o = one.stream().filter((s) -> {
            return s.length() >= 3;
        }).limit(2);

        Stream<String> t = two.stream().filter((s) -> {
            return s.contains("张");
        }).skip(1);

        Stream.concat(o, t).map((s) -> {
            return new Person(s);
        }).forEach((s) -> {
            System.out.println(s);
        });
    }

    
}
