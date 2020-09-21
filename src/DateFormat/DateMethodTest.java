package DateFormat;

import java.text.ParseException;

public class DateMethodTest
{
    public static void main(String[] args) throws ParseException {
        //string转date   parse;
        //date转string   format;

        DateMethod dateMethod = new DateMethod();
        System.out.println("日期转字符串:"+dateMethod.dateToString());
        System.out.println("字符串转日期:"+dateMethod.stringToDate());

        dateMethod.calDate();
    }
}
