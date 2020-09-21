package System;

public class SystemMethodClass
{
    public void getCurrentTime()
    {
        Long first = System.currentTimeMillis();
        for(int i = 0; i<100 ; i++)
        {
            System.out.println(i);
        }
        Long secrond = System.currentTimeMillis();
        System.out.println("循环花的时间:"+(secrond-first));
    }

    public void copyArrayAction()
    {
        int[] first = new int[]{1,2,3,4,5};
        int[] second = new int[]{6,7,8,9,10};
        System.arraycopy(first,1,second,0,2);
        for (int i : second)
        {
            System.out.println(i);
        }
    }
}
