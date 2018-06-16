package DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_20 {
    public static void main(String[] args) {
        Instant currentTimestamp = Instant.now();
        System.out.println("current timestamp: " + currentTimestamp);
    }
}
