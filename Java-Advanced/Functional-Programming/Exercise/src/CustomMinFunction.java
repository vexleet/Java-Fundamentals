import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Integer[] numbers = new Integer[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        Function<Integer[], Integer> findMin = nums -> {
          Integer lowest = Integer.MAX_VALUE;

            for (Integer num : nums) {
                if(lowest > num){
                    lowest = num;
                }
            }

          return  lowest;
        };

        System.out.println(findMin.apply(numbers));
    }
}
