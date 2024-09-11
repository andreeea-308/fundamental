import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = ScannerUtils.readIntegerNumber(scanner);
scanner.close();
        for (int i = 1; i <= n; i++) {
            if (i <= 3) {
                System.out.println(i);
            } else {
                int rest = -1;
                for (int j = 2; j <= i / 2 + 1; j++) {
                    rest = i % j;
                    if (rest == 0) {
                        break;
                    }
                }
                if (rest != 0) {
                    System.out.println(i);

                }
            }
        }
    }
}
