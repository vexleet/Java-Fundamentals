import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = "\\b(^|(?<=\\s))[a-zA-Z0-9]+(\\.|\\-|_)?([a-zA-Z0-9]+)@([a-zA-Z]+([\\.\\-_][A-Za-z]+)+)(\\b|(?=\\s))";
        String input = scanner.nextLine();

        Pattern p = Pattern.compile(pattern);

        Matcher m = p.matcher(input);

        while (m.find()) {
            System.out.println(m.group(0));
        }
    }
}
