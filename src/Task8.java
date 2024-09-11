import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        float num1 = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Introduceti simbol operatie matematica(+, -, /, *): ");
        char simbol = scanner.nextLine().charAt(0);
        System.out.println("Introduceti al doilea numar: ");
        float num2 = scanner.nextFloat();
        scanner.close();
        if (num2 == 0 && simbol == '/') {
            System.out.println("Cannot be calculate");
            return;
        }

        switch (simbol) {
            case '+': {
                System.out.println("Suma numerelor: " + (num1+num2));
                break;
            }
            case '-': {
                System.out.println("Diferenta numerelor: " + (num1-num2));
                break;
            }
            case '/': {
                System.out.println("Catul numerelor: " + num1/num2);
                break;
            }
            case '*': {
                System.out.println("Produsul numerelor: " + num1*num2);
                break;
            }
            default: {
                System.out.println("Operatie invalida");
            }
        }
    }
}
