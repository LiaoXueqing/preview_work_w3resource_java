package DateTime;

import java.time.LocalDate;
import java.time.Period;

public class DateTime_32 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate userDate = LocalDate.of(1992,8,14);
        Period period = Period.between(userDate,currentDate);
        System.out.println("my age: "+period.getYears()+" years "+
                period.getMonths()+" months "+period.getDays() +" days");
    }
}
