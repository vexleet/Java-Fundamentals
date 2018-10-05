import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String keyWord = scanner.nextLine();
        String pattern = "\\b[A-Z][^!.?]*?\\b" + keyWord + "\\b[^!.?]*?[.!?]";

        String input = scanner.nextLine();

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);

        while (m.find()) {
            System.out.println(m.group(0));
        }
    }
}
