import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");

        Predicate<String> checkUpperCase = s -> s.charAt(0) == s.toUpperCase().charAt(0);

        List<String> result = new ArrayList<>();

        for (int i = 0; i < text.length; i++) {
            if(checkUpperCase.test(text[i])){
                result.add(text[i]);
            }
        }

        System.out.println(result.size());
        result.forEach(x -> System.out.println(x));
    }
}
