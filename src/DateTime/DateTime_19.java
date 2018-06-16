package DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateTime_19 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate userDate = LocalDate.of(2011, Month.SEPTEMBER, 6);
        Period diff = Period.between(currentDate, userDate);
        System.out.println("Difference between " + currentDate + " and " + userDate + " : " + diff.getYears()
                + " year(s) " + "and " + diff.getMonths() + " month(s)");
    }
}
