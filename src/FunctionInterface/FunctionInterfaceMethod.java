package FunctionInterface;

public class FunctionInterfaceMethod
{
    public static void main(String[] args)
    {
        doSomething(()->{ System.out.println("aaa"); });
    }

    public static void doSomething(MyFunctionInterface myFunctionInterface)
    {
        myFunctionInterface.myMethod();
    }
}
