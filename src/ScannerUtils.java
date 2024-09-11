import java.util.Scanner;

public class ScannerUtils {

    public static int readIntegerNumber(Scanner scanner) {


        int number;
        try {
            number = scanner.nextInt();
        } catch (Exception exception) {
            System.out.println("Numarul introdus trebuie sa fie numar intreg. \nMai incearca o data");
            scanner.nextLine();
            number = readIntegerNumber(scanner);
        }
        scanner.nextLine();
        return number;
    }

    public static double readDoubleNumber(Scanner scanner) {

        double number;
        try {
            number = scanner.nextDouble();
        } catch (Exception exception) {
            System.out.println("Numarul introdus trebuie sa fie numar real. \nMai incearca o data");
            scanner.nextLine();
            number = readDoubleNumber(scanner);
        }
        scanner.nextLine();
        return number;
    }
}
