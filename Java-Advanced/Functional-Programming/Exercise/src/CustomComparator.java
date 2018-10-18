import java.util.Arrays;
import java.util.Scanner;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Integer[] numbers = new Integer[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(numbers, (a, b) -> {
            if(a % 2 == 0 && b % 2 != 0){
                return -1;
            }
            else if(b % 2 == 0 && a % 2 != 0){
                return 1;
            }
            else{
                return a - b;
            }
        });

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
