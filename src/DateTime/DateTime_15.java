package DateTime;

import java.time.LocalTime;

public class DateTime_15 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalTime addHourTime = time.plusHours(1);
        System.out.println("Time after 1 hour: "+addHourTime);
    }
}
