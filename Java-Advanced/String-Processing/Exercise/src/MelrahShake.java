import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MelrahShake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String keyWord = scanner.nextLine();

        while (true) {
            if (keyWord.equals("")) {
                System.out.println("No shake.");
                break;
            }

            String pattern = Pattern.quote(keyWord);
            Pattern p = Pattern.compile(pattern);
            Matcher matcher = p.matcher(text);

            int counter = 0;

            while (matcher.find()) {
                counter++;
            }

            if (counter >= 2) {
                text = text.replaceFirst(pattern.toString(), "");
                text = replaceLast(keyWord, "", text);

                StringBuilder replaceChar = new StringBuilder(keyWord);
                int indexToDelete = keyWord.length() / 2;

                keyWord = keyWord.substring(0, indexToDelete) + keyWord.substring(indexToDelete + 1);

                System.out.println("Shaked it.");
            } else {
                System.out.println("No shake.");
                break;
            }
        }

        System.out.println(text);
    }

    public static String replaceLast(String find, String replace, String string) {
        int lastIndex = string.lastIndexOf(find);

        if (lastIndex == -1) {
            return string;
        }

        String beginString = string.substring(0, lastIndex);
        String endString = string.substring(lastIndex + find.length());

        return beginString + replace + endString;
    }
}