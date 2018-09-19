import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(\\s*<.+?>)");

        while (!input.equals("END")){
            Matcher matcher = pattern.matcher(input);

            while(matcher.find()){
                System.out.println(matcher.group().trim());
            }

            input = scanner.nextLine();
        }
    }
}
