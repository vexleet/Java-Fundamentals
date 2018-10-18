import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int specialNumber = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        Function<int[], int[]> reverseNumbers = nums -> {
            int[] reversedNumbers = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                reversedNumbers[i] = nums[nums.length - 1 - i];
            }

            return reversedNumbers;
        };

        numbers = reverseNumbers.apply(numbers);

        Predicate<Integer> isDivisible = n -> n % specialNumber != 0;

        List<String> result = new ArrayList<>();

        for (int number : numbers) {
            if(isDivisible.test(number)){
                result.add(String.valueOf(number));
            }
        }

        System.out.println(String.join(" ", result));
    }
}
