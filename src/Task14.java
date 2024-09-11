import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first lowercase letter: ");
        char firstLetter = scanner.next().charAt(0);

        System.out.print("Enter the second lowercase letter: ");
        char secondLetter = scanner.next().charAt(0);

        // Convert letters to their corresponding ASCII values
        int asciiFirst = (int) firstLetter;
        int asciiSecond = (int) secondLetter;

        // Calculate the number of characters between the letters
        int charactersBetween = Math.abs(asciiSecond - asciiFirst) - 1;

        System.out.printf("There are %d characters between '%c' and '%c'.\n",
                charactersBetween, firstLetter, secondLetter);

        scanner.close();
    }
}
