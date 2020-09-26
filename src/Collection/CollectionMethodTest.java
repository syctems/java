package Collection;

import java.util.Arrays;

public class CollectionMethodTest
{
    public static void main(String[] args)
    {
        CollectionMethod collectionMethod = new CollectionMethod();
        System.out.println("集合是否为空:"+collectionMethod.hasEmptyAction());
        System.out.println("集合的总数:"+collectionMethod.getSize());
        System.out.println("集合是否有张龙辉:"+collectionMethod.hasContain());
        System.out.println("清除集合赵六:"+collectionMethod.removeAction());
        Arrays.stream(collectionMethod.toArrayAction()).forEach((x) -> {System.out.println(x);});
        collectionMethod.clearAction();
        System.out.println("清空集合后的总数:"+collectionMethod.getSize());


        System.out.println("================");
        ArrayListMethod arrayListMethod = new ArrayListMethod();
        arrayListMethod.addAction();
        arrayListMethod.display();

        arrayListMethod.removeAction();
        arrayListMethod.display();

        System.out.println("获取第一个的值:"+arrayListMethod.getAction());

        arrayListMethod.setAction();
        arrayListMethod.display();
        System.out.println("================");

        LinkedListMethod linkedListMethod = new LinkedListMethod();
        linkedListMethod.addFirstAction();
        linkedListMethod.display();

        System.out.println("获取第一个的值:"+linkedListMethod.getFirstAction());
        System.out.println("获取最后一个的值:"+linkedListMethod.getLastAction());

        System.out.println("除去第一个的值:"+linkedListMethod.removeFirstAction());
        System.out.println("除去最后一个的值:"+linkedListMethod.removeLastAction());

        linkedListMethod.getLink();

        HashSetMethod hashSetMethod = new HashSetMethod();
        hashSetMethod.addAction();
        hashSetMethod.display();

        System.out.println("================");
        MapMethod mapMethod = new MapMethod();
        mapMethod.addAction();
        mapMethod.display();
        mapMethod.display2();
    }
}
