import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        String command = scanner.nextLine();

        Function<int[], int[]> addNumbers = nums -> {
            for (int i = 0; i < nums.length; i++) {
                nums[i] += 1;
            }

            return  nums;
        };

        Function<int[], int[]> multiplyNumbers = nums -> {
            for (int i = 0; i < nums.length; i++) {
                nums[i] *= 2;
            }

            return  nums;
        };

        Function<int[], int[]> subtractNumbers = nums -> {
            for (int i = 0; i < nums.length; i++) {
                nums[i] -= 1;
            }

            return  nums;
        };

        Consumer<int[]> printNumbers = nums -> {
            List<String> print = new ArrayList<>();
            for (int num : nums) {
                print.add(String.valueOf(num));
            }

            System.out.println(String.join(" ", print));
        };

        while(!command.equals("end")){

            switch (command){
                case "add":
                    numbers = addNumbers.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiplyNumbers.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtractNumbers.apply(numbers);
                    break;
                case "print":
                    printNumbers.accept(numbers);
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
