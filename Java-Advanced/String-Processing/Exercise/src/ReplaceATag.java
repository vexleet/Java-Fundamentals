import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceATag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder str = new StringBuilder();
        String input = scanner.nextLine();

        while(!input.equals("END")){
            str.append(input + "\n");

            input = scanner.nextLine();
        }
        String result = str.toString();

        Pattern pattern = Pattern.compile("(<a)\\s+href[^>]+(>)\\s*.*?(</a>)");
        Matcher matcher = pattern.matcher(result);


        while(matcher.find()){
            String entireGroups = matcher.group(0);
            String openATag = matcher.group(1);
            String closeOpenATag = matcher.group(2);
            String closeATag = matcher.group(3);

            String replacement = entireGroups.replaceFirst(openATag, "[URL");
            replacement = replacement.replaceFirst(closeOpenATag, "]");
            replacement = replacement.replaceFirst(closeATag, "[/URL]");

            result = result.replace(entireGroups, replacement);
        }

        System.out.println(result);
    }
}