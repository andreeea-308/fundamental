import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        System.out.println("Induceti 10 numere de tip intreg cu enter intre ele: ");
        Scanner scanner =  new Scanner(System.in);
        int[] arrayOfNumbers = new int[10];
        //Citirea si salvarea numerelor intr-un array
        for (int i = 0; i< arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = ScannerUtils.readIntegerNumber(scanner);
        }
        Task15 object = new Task15();
        int[] duplicates = object.getDuplicateNumbers(arrayOfNumbers);
        object.showNumbersFromArray(duplicates);

    }

    public void showNumbersFromArray (int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    public int[] getDuplicateNumbers (int[] numbers) {
        int howManyDuplicates = 0;
        int[] temporaryNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    if (!isDuplicate(temporaryNumbers, numbers[i])) {
                        temporaryNumbers[howManyDuplicates] = numbers[i];
                        howManyDuplicates++;
                    }
                }
            }
        }
        int[] duplicateNumbers = new int[howManyDuplicates];
        System.arraycopy(temporaryNumbers, 0, duplicateNumbers, 0, howManyDuplicates);
        return duplicateNumbers;
    }

    public boolean isDuplicate (int[] array, int number) {
        for (int element : array) {
            if (element == number) {
                return true;
            }
        }
        return false;
    }
}
