package DateTime;

import java.util.Calendar;

public class DateTime_2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        int month = (int)cal.get(Calendar.MONTH)+1;

        System.out.println("year: "+cal.get(Calendar.YEAR));
        System.out.println("month: "+month);
        System.out.println("day: "+cal.get(Calendar.DATE));
        System.out.println("hour: "+cal.get(Calendar.HOUR));
        System.out.println("minute: "+cal.get(Calendar.MINUTE));
    }
}
