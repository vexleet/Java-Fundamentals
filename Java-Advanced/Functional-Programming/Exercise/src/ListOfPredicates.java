import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upperBound = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
        Integer[] numbers = new Integer[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        Predicate<Integer> checkIfDivisible = num -> {
            boolean isDivisible = true;

            for (Integer number : numbers) {
                if(num % number != 0){
                    isDivisible = false;
                    break;
                }
            }

            return isDivisible;
        };

        List<String> result = new ArrayList<>();

        for (int i = 1; i <= upperBound; i++) {
            if(checkIfDivisible.test(i)){
                result.add(String.valueOf(i));
            }
        }

        System.out.println(String.join(" ", result));
    }
}