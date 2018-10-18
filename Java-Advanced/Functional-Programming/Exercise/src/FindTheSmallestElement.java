import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        Function<List<Integer>, Integer> findMin = nums -> {
            Integer lowest = Integer.MAX_VALUE;

            for (Integer num : nums) {
                if(lowest > num){
                    lowest = num;
                }
            }

            return nums.lastIndexOf(lowest);
        };

        System.out.println(findMin.apply(numbers));
    }
}
