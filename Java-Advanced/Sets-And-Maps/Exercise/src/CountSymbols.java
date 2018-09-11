import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Character, Integer> occurrencesOfEachChar = new TreeMap<>();

        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if(!occurrencesOfEachChar.containsKey(currentChar)){
                occurrencesOfEachChar.put(currentChar, 1);
            }
            else {
                occurrencesOfEachChar.put(currentChar, occurrencesOfEachChar.get(currentChar) + 1);
            }
        }

        for (Character character : occurrencesOfEachChar.keySet()) {
            System.out.printf("%s: %s time/s %n", character, occurrencesOfEachChar.get(character));
        }
    }
}
