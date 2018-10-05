import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String pattern = "^[A-Z][a-z]+ [A-Z][a-z]+$";

        Pattern p = Pattern.compile(pattern);

        while(!input.equals("end")){
            Matcher m = p.matcher(input);

            if(m.find()){
                System.out.println(input);
            }

            input = scanner.nextLine();
        }
    }
}
