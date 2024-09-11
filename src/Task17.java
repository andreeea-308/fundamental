import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the date of your next SDA class (dd.MM.yyyy): ");
        String userInput = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate nextSDADate = LocalDate.parse(userInput, formatter);

        LocalDate currentDate = LocalDate.now();
        long daysLeft = ChronoUnit.DAYS.between(currentDate, nextSDADate);

        System.out.println("Days left until your next SDA class: " + daysLeft);

        scanner.close();
    }
}
