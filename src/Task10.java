import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        System.out.print("Introdu un numar Pozitiv: ");
        Scanner scanner =  new Scanner(System.in);
        int n = ScannerUtils.readIntegerNumber(scanner);
        if (n<0) {
            System.out.println("Numarul incorect");
            return;
        }
        int sum = 0;
        while (n>0) {
            int digit = n % 10;
            sum = digit + sum;
            n = n / 10;
        }
        System.out.println("Suma este: " + sum);
        scanner.close();
    }
}
