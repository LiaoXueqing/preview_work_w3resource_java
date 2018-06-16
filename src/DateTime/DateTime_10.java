package DateTime;

import java.time.YearMonth;

public class DateTime_10 {
    public static void main(String[] args) {
        YearMonth ym = YearMonth.of(2018,6);

        String firstDayOfMonth = ym.atDay(1).getDayOfWeek().name();
        String lastDayOfMonth = ym.atEndOfMonth().getDayOfWeek().name();

        System.out.println("The first day of a month: "+firstDayOfMonth);
        System.out.println("The last day of a month: "+lastDayOfMonth);
    }
}
