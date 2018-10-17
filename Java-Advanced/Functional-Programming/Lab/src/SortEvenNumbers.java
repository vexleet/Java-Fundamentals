import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        numbers.removeIf(n -> n % 2 != 0);

        System.out.println(numbers.stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining(", ")));

        numbers.sort((a, b) -> a.compareTo(b));

        System.out.println(numbers.stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining(", ")));

    }
}
