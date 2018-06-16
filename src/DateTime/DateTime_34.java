package DateTime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime_34 {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();

        cal.set(Calendar.HOUR_OF_DAY,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);

        System.out.println("The today date at midnight time: "+cal.getTime());
    }
}
