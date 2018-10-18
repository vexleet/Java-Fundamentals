import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String command = scanner.nextLine();

        int lowerBound = Integer.parseInt(input[0]);
        int upperBound = Integer.parseInt(input[1]);

        Predicate<Integer> isOdd = n -> n % 2 != 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;

        List<String> result = new ArrayList<>();
        if(command.equals("odd")){
            for(int i = lowerBound; i <= upperBound; i++){
                if(isOdd.test(i)){
                    result.add(String.valueOf(i));
                }
            }
        }
        if(command.equals("even")){
            for(int i = lowerBound; i <= upperBound; i++){
                if(isEven.test(i)){
                    result.add(String.valueOf(i));
                }
            }
        }

        System.out.println(String.join(" ", result));
    }
}
