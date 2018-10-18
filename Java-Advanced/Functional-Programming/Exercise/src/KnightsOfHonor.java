import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Consumer<String> print = x -> System.out.println("Sir " + x);

        for (String s : input) {
            print.accept(s);
        }
    }
}
