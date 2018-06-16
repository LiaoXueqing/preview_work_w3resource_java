package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTime_29 {
    public static void main(String[] args) {
        String str = "June,4,2018";
        DateTimeFormatter formatter = DateTimeFormatter.
                ofPattern("MMMM,d,yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(str,formatter);
        System.out.println("The date: "+date);
    }
}
