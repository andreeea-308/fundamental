import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        scanner.close();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta >= 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2*a);
            double x2 = (-b + Math.sqrt(delta)) / (2*a);
            System.out.println("Delta pozitiv");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("Delta negative");
        }
    }
}
