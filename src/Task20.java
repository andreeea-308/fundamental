import java.util.Random;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);

        int userNumber;
        do {
            System.out.print("Enter a number between 0 and 100: ");
            userNumber=ScannerUtils.readIntegerNumber(scanner);
            if (userNumber == randomNumber) {
                System.out.println("Congratulations!");
            } else if (userNumber < randomNumber) {
                System.out.println("Not enough!");
            } else {
                System.out.println("Too much!");

            }
        } while (userNumber != randomNumber);

        scanner.close();
    }
}
