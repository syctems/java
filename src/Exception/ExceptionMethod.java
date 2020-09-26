package Exception;

public class ExceptionMethod
{
    public void ArrayException()
    {
        int[] arr = {1,22,44};
        arr[3]=33;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(i);
        }
    }

    public boolean checkNum(int[] arr,int i)
    {
        for (int j =0;j<arr.length;j++)
        {
            if(j == i)
            {
                return true;
            }
        }
        return false;
    }
}
