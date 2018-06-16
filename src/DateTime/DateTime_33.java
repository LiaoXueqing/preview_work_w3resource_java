package DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateTime_33 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("The previous Friday: "+
                currentDate.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));
        System.out.println("The next Friday: "+
                currentDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
    }
}
