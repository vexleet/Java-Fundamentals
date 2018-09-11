import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] number = scanner.nextLine().split(" ");

        int n = Integer.parseInt(number[0]);
        int m = Integer.parseInt(number[1]);

        LinkedHashSet<Integer> nNumbers = new LinkedHashSet<>();
        LinkedHashSet<Integer> mNumbers = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            nNumbers.add(currentNumber);
        }

        for (int i = 0; i < m; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            mNumbers.add(currentNumber);
        }

        LinkedHashSet<Integer> repeatingElements = new LinkedHashSet<>();

        for (Integer nNumber : nNumbers) {
            if(mNumbers.contains(nNumber)){
                repeatingElements.add(nNumber);
            }
        }

        for (Integer repeatingElement : repeatingElements) {
            System.out.print(repeatingElement + " ");
        }
    }
}
