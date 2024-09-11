import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        String[] words = userInput.split("\\s+"); // Split by whitespace

        for (String word : words) {
            System.out.print(word + " " + word + " ");
        }

        scanner.close();
    }
}
