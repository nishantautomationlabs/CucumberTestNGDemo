package Base;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Util {

    public static String generateData(int length, String chars)
    {
        Random random = new Random();
        char[] text;
        text = new char[length];
        for (int i = 0; i < length; i++)
        {
            text[i] = chars.charAt(random.nextInt(chars.length()));
        }
        return new String(text);
    }

    public static Date getDateFromString(String dateString, String format)
    {
        Calendar calendar = Calendar.getInstance();
        try
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            Date date = dateFormat.parse(dateString);
            calendar.setTime(date);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return calendar.getTime();
    }
}
