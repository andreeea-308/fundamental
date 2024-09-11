import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti weight: ");
        float weight = scanner.nextFloat();
        System.out.println("Introduceti height: ");
        float height = scanner.nextInt();
        scanner.close();
        float heightInMeters = height / 100;
        float bmi;
        bmi = weight / (heightInMeters * heightInMeters);
        System.out.println("BMI este: " + bmi);
        if ((bmi < 18.5) && (bmi > 24.9)) {
            System.out.println("BMI not optimal");
        } else {
            System.out.println("BMI optimal");
        }

    }
}
