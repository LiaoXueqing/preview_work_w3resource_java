package DateTime;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class DateTime_12 {
    public static void main(String[] args) {
        DateFormatSymbols dfs = new DateFormatSymbols(new Locale("de"));

        String[] dayNames = dfs.getWeekdays();

        for (String s: dayNames) {
            System.out.println(s);
        }
    }
}
