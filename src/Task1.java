import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un diametru: ");
        float diametru = scanner.nextFloat();
        scanner.close();
        System.out.println("Perimetru cercului este: " + Math.PI * diametru);
    }
}
