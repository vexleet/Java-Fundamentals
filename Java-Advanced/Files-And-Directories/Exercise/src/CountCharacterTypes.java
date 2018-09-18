import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountCharacterTypes {
    public static void main(String[] args) {
        String inputPath = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Exercise\\Resources\\input.txt";
        String outputPath = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Exercise\\Resources\\output.txt";

        int vowelsCounter = 0;
        int consonantsCounter = 0;
        int punctuationCounter = 0;

        List<Character> punctuation = new ArrayList<>();
        List<Character> vowels = new ArrayList<>();

        Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u');
        Collections.addAll(punctuation, '!', ',', '.', '?');

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputPath));
             PrintWriter out = new PrintWriter(new FileWriter(outputPath))) {
            String line = reader.readLine();


            while (line != null) {
                for (char c : line.toCharArray()) {
                    if (vowels.contains(c)) {
                        vowelsCounter++;

                    } else if (punctuation.contains(c)) {
                        punctuationCounter++;
                    } else if (c != ' ') {
                        consonantsCounter++;
                    }
                }

                line = reader.readLine();
            }

            out.println("Vowels: " + vowelsCounter);
            out.println("Consonants: " + consonantsCounter);
            out.println("Punctuation: " + punctuationCounter);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
