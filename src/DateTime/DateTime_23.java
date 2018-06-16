package DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class DateTime_23 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate lastDayOfYear = currentDate.with(TemporalAdjusters.lastDayOfYear());
        Period period = currentDate.until(lastDayOfYear);

        System.out.println("The months remaining in the year: " + period.getMonths());
    }
}
