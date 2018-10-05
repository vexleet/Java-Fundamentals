import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String pattern = "^\\+359([ -])2\\1\\d{3}\\1\\d{4}$";

        Pattern p = Pattern.compile(pattern);

        while (!input.equals("end")) {
            Matcher m = p.matcher(input);

            if (m.find()) {
                System.out.println(input);
            }

            input = scanner.nextLine();
        }
    }
}

