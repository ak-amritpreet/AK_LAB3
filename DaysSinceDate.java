import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysSinceDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("MM dd yyyy");

        System.out.print("ENTER A DATE (MM dd yyyy): ");
        String DateInput = scanner.nextLine();

        LocalDate InputDate = LocalDate.parse(DateInput, Formatter);

        LocalDate CurrentDate = LocalDate.now();

        long DaysSince = ChronoUnit.DAYS.between(InputDate, CurrentDate);

        System.out.println("IT HAS BEEN " + DaysSince + " DAYS SINCE " + InputDate.format(Formatter) + ".");
    }
}