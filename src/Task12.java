import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String userInput = scanner.nextLine();

        int totalCharacters = userInput.length();
        int spaceCount = 0;

        for (char c : userInput.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        double spacePercentage = (double) spaceCount / totalCharacters * 100;

        System.out.printf("Percentage of space characters: %.2f%%\n", spacePercentage);

        scanner.close();
    }
}
