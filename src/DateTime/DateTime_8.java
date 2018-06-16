package DateTime;

import java.util.Calendar;

public class DateTime_8 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH,cal.getActualMaximum(Calendar.DAY_OF_MONTH));

        System.out.println("The last date of the month: "+cal.getTime());
    }
}
