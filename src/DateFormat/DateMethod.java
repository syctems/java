package DateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMethod
{
    private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    public String dateToString()
    {
        Date date = new Date();
        String ds = dateFormat.format(date);
        return ds;
    }

    public Date stringToDate()
    {
        Date d = null;
        try{
             d = dateFormat.parse(dateToString());
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return d;
    }

    public void calDate() throws ParseException {
        String oldDate = "2019/09/08";
        String newDate = "2019/09/21";

        Long d = getScend(newDate) - getScend(oldDate);
        System.out.println("2019/09/21 - 2019/09/08 . 相隔"+d/(1000*3600*24)+"天.");
    }

    public Long getScend(String s) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = simpleDateFormat.parse(s);
        return date.getTime();
    }
}
