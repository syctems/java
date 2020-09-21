package Calendar;

import java.util.Calendar;

public class CalendarMethod
{
    private Calendar calendar = Calendar.getInstance();

    public void getCalendar()
    {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("今天的日历时间是:" + year+"/"+month+"/"+day);
    }

    public void setCalendar()
    {
        calendar.set(Calendar.YEAR,2021);
        System.out.println("设置的日历年份是:" + calendar.get(Calendar.YEAR));
    }

    public void addCalendar()
    {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("今天的日历时间是:" + year+"/"+month+"/"+day);
        calendar.add(Calendar.YEAR,3);
        calendar.add(Calendar.MONTH,1);
        System.out.println("设置的日历时间是:" + calendar.get(Calendar.YEAR) +"/"+ (calendar.get(Calendar.MONTH) + 1) +"/"+ calendar.get(Calendar.DAY_OF_MONTH));
    }
}
