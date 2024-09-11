import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Introduceti pozitia pentru a afisa numaului lui Fibonacci");
        Scanner scanner =  new Scanner(System.in);
        int n = ScannerUtils.readIntegerNumber(scanner);
        if (n <= 0){
            System.out.println("Introdu un numar mai mare de 0");
            return;
        }
        int n1 = 1;
        int n2 = 1;
        int currentN = 1;
        for (int i = 3; i <=n; i++) {
            currentN = n1 + n2;
            n1 = n2;
            n2 = currentN;
        }
        scanner.close();
        System.out.println("Valoarea lui Fibonacci de pe pozitia " + n + " este " + currentN);
    }
}
