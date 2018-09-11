import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfChemicalCompounds = Integer.parseInt(scanner.nextLine());

        TreeSet<String> uniqueChemicalElements = new TreeSet<>();

        for (int i = 0; i < numberOfChemicalCompounds; i++) {
            String[] chemicalElements = scanner.nextLine().split(" ");

            for (int j = 0; j < chemicalElements.length; j++) {
                String currentChemicalElement = chemicalElements[j];

                uniqueChemicalElements.add(currentChemicalElement);
            }
        }

        for (String uniqueChemicalElement : uniqueChemicalElements) {
            System.out.print(uniqueChemicalElement + " ");
        }
    }
}
