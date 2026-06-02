package date_handling;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Index {

    public static void main(String[] args) {

        // Getting Current Date & Time

        /*
         Current Time
        LocalTime time = LocalTime.now();
        System.out.println(time);

        Current Date and Time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        Current Timestamp in UTC
        Instant instant = Instant.now();
        System.out.println(instant);
        */

        // Custom Date-Time Formatting

        /*
         Get current date and time
        LocalDateTime dateTime = LocalDateTime.now();

        // Create custom format
        // dd -> Day
        // MM -> Month
        // yyyy -> Year
        // hh -> Hour (12-hour format)
        // mm -> Minutes
        // ss -> Seconds
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");

         Convert LocalDateTime into formatted String
        String newdateTime = dateTime.format(formatter);

        System.out.println(newdateTime);
        */

        // Creating a Specific Date

        // Creates a date: 02-09-2026
        LocalDate date = LocalDate.of(2026, 9, 2);

        System.out.println(date);

        // Creating Specific Date-Time Objects

        // Year, Month, Day, Hour, Minute, Second
        LocalDateTime dateTime1 = LocalDateTime.of(2026, 9, 2, 5, 30, 0);

        LocalDateTime dateTime2 =LocalDateTime.of(2025, 9, 2, 5, 30, 0);

        // Comparing Date-Time Objects

        // Checks if dateTime1 comes before dateTime2
        if (dateTime1.isBefore(dateTime2)) {
            System.out.println(dateTime1 + " is earlier than " + dateTime2);
        }

        // Checks if dateTime1 comes after dateTime2
        else if (dateTime1.isAfter(dateTime2)) {
            System.out.println(dateTime1 + " is later than " + dateTime2);
        }

        // Checks if both date-times are exactly equal
        else if (dateTime1.isEqual(dateTime2)) {
            System.out.println(dateTime1 + " is equal to " + dateTime2);
        }
    }
}