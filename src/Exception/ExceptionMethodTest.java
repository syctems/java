package Exception;

public class ExceptionMethodTest
{
    public static void main(String[] args) throws RegisterException {
        ExceptionMethod exceptionMethod = new ExceptionMethod();
//        exceptionMethod.ArrayException();

        int[] arr = {1,2,3,4};

        if(exceptionMethod.checkNum(arr,5))
        {
            System.out.println("值存在");
        }else {
            throw new RegisterException("值不存在");
        }
    }
}
