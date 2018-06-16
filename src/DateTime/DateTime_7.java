package DateTime;

import java.util.Calendar;

public class DateTime_7 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println("The last day of the current month: "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
