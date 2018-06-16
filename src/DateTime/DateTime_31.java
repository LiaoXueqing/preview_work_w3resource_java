package DateTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class DateTime_31 {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime userDateTime = LocalDateTime.of(1992, 8, 14, 12,
                10, 12);
        Duration diffInTwoTime = Duration.between(userDateTime, currentDateTime);

        System.out.println("The difference between " + currentDateTime + " and " + userDateTime + " is: "
                + diffInTwoTime.toHours() + " hours " + diffInTwoTime.toMinutes() + " minutes " + diffInTwoTime.toMillis() + " milli "
                + diffInTwoTime.getSeconds() + " seconds " + diffInTwoTime.getNano() + " nano");

    }
}
