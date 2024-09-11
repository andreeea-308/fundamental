import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String userInput = scanner.nextLine();

        if (userInput.matches("acho+!")) {
            System.out.println("Bless you!");
        } else {
            System.out.println("You didn't sneeze.");
        }

        scanner.close();
    }
}
