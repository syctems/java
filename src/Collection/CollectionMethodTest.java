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
    }
}
