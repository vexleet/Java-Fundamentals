import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitByWordCasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lowerCaseWords = new ArrayList<>();
        List<String> upperCaseWords = new ArrayList<>();
        List<String> mixedCaseWords = new ArrayList<>();

        String[] words = scanner.nextLine().split("[.!,/()'\\\\\";:\\[\\] ]");

        for (String word : words) {
            if(word.isEmpty()){
                continue;
            }

            if(getSpecialCharacterCount(word)){
                mixedCaseWords.add(word);
                continue;
            }

            if(word.equals(word.toLowerCase())){
                lowerCaseWords.add(word);
            }
            else if(word.equals(word.toUpperCase())){
                upperCaseWords.add(word);
            }
            else{
                mixedCaseWords.add(word);
            }
        }

        System.out.printf("Lower-case: %s", String.join(", ", lowerCaseWords));
        System.out.println();
        System.out.printf("Mixed-case: %s", String.join(", ", mixedCaseWords));
        System.out.println();
        System.out.printf("Upper-case: %s", String.join(", ", upperCaseWords));
    }

    public static boolean getSpecialCharacterCount(String s) {
        Pattern p = Pattern.compile("[^A-Za-z]+");
        Matcher m = p.matcher(s);
        // boolean b = m.matches();
        boolean b = m.find();
        if (b == true)
            return true;

        return false;
    }
}