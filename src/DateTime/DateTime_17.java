package DateTime;

import java.util.Calendar;
import java.util.Date;

public class DateTime_17 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date currentDate = cal.getTime();

        cal.add(Calendar.YEAR,-1);
        Date pDate = cal.getTime();

        cal.add(Calendar.YEAR,2);
        Date aDate = cal.getTime();

        System.out.println("The current Date: "+currentDate);
        System.out.println("The Date before one year: "+pDate);
        System.out.println("The Date after one year: "+aDate);
    }
}
