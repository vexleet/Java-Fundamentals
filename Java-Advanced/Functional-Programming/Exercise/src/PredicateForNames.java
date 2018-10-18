import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split(" ");

        Predicate<String> checkForLength = name -> name.toCharArray().length <= length;

        for (String name : names) {
            if(checkForLength.test(name)){
                System.out.println(name);
            }
        }
    }
}
