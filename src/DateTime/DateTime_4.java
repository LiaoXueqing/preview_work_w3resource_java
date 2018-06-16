package DateTime;

import java.util.Calendar;

public class DateTime_4 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println("Actual Maximum Year: "+cal.getActualMinimum(Calendar.YEAR));
        System.out.println("Actual Maximum Month: "+cal.getActualMinimum(Calendar.MONTH));
        System.out.println("Actual Maximum Week of Year: "+cal.getActualMinimum(Calendar.WEEK_OF_YEAR));
        System.out.println("Actual Maximum Date: "+cal.getActualMinimum(Calendar.DATE));
    }
}
