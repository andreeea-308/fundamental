import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Introdu numarul de valuri: ");
        Scanner scanner =  new Scanner(System.in);
        int n = ScannerUtils.readIntegerNumber(scanner);
        System.out.println("Introdu numarul de linii: ");
        int m = 10;
        String star = "*";
        String space = " ";
        for (int i = 1; i <= m; i++) {
            int between = ((m*2)-(2*i));
            String line = "%" + i + "s%" + between + "s%-" + i + "s";
            if (between == 0) {
                line = "%" + i + "s%s%-" + i + "s";
            }
            for (int j = 1; j < n; j++) {
                System.out.printf(line,star,space,star);
            }
            System.out.println();
        }
        scanner.close();
    }
}
