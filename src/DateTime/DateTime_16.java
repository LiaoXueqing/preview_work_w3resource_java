package DateTime;

import java.util.Calendar;
import java.util.Date;

public class DateTime_16 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date currentTime = cal.getTime();

        int twoWeek = 14;
        cal.add(Calendar.DAY_OF_YEAR, twoWeek);

        Date timeInTwoWeek = cal.getTime();

        System.out.println("The current time: " + currentTime);
        System.out.println("The time in two weeks: " + timeInTwoWeek);
    }
}
