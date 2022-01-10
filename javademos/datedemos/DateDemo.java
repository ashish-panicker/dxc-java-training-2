package javademos.datedemos;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import javax.swing.text.DateFormatter;

public class DateDemo {

    public static void main(String[] args) {
        dateDemo();
    }

    static void dateDemo(){
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);
        System.out.println("Today: " + today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Today: " + today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("Today: " + today.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));

        System.out.println("Tomorrow: " + today.plusDays(1));
        System.out.println("Yesterday: " + today.minusDays(1));
        System.out.println("Next week: " + today.plusWeeks(1));
        LocalDate sampleDate = LocalDate.parse("2012-10-01");
        System.out.println(sampleDate.getDayOfMonth() + " " + sampleDate.getMonth() + " "
                + sampleDate.getDayOfWeek() + " " + sampleDate.getYear());
        System.out.println(sampleDate.plus(1, ChronoUnit.MONTHS));
        System.out.println(sampleDate.minus(100, ChronoUnit.DAYS));
        System.out.println(sampleDate.minus(10, ChronoUnit.WEEKS));
        System.out.println(sampleDate.isAfter(today));
        System.out.println(sampleDate.isLeapYear());
    }

    static void buildYourOwnDate(){
        String day ;
        String month;
        String year;

        System.out.println("Enter the day: ");
        day = System.console().readLine();

        System.out.println("Enter the month: ");
        month = System.console().readLine();

        System.out.println("Enter the year: ");
        year = System.console().readLine();

        System.out.println("You were born on:" +
        LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day)));
    }

    static void timeDemo(){
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss a");
        System.out.println("Current time in 12-hour format: " + time.format(timeFormatter));
        System.out.println(time.plusMinutes(50));
        System.out.println(time.plus(50, ChronoUnit.SECONDS));
        System.out.println(time.plus(50, ChronoUnit.MINUTES));
        LocalTime sixThirty = LocalTime.of(6, 30);
        System.out.println(time.isAfter(sixThirty));
        LocalTime elvenThirty = LocalTime.parse("11:30");
    }
}
