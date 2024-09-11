import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Introduceti text:");
        Scanner scanner = new Scanner(System.in);
        String text = "";
        String longestText = "";

        do {
            text = scanner.nextLine();
            if ((text.length() >= longestText.length()) && (!text.equals("Enough!"))) {
                longestText = text;
            }
        } while (!text.equals("Enough!"));
        if (!longestText.isEmpty()) {
            System.out.println(longestText);
        } else {
            System.out.println("No text provided");
        }

    }
}
