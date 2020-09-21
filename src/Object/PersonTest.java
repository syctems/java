package Object;

public class PersonTest
{
    public static void main(String[] args)
    {
        Person person1 = new Person("zhangsan",12);
        Person person2 = new Person("lisi",13);
        Person person3 = new Person("zhangsan",13);

        System.out.println("person1和person2是否相等 :"+ person1.equals(person2));
        System.out.println("person1和person3是否相等 :"+ person1.equals(person3));
    }
}
