package DateTime;

import java.time.LocalDate;

public class DateTime_22 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("The current Date: "+currentDate);
        System.out.println("The dates before today: "+currentDate.plusDays(-10));
        System.out.println("The dates after today: "+currentDate.plusDays(10));
    }
}
