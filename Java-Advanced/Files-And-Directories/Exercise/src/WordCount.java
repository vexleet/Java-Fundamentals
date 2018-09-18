import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String wordsPath = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Exercise\\Resources\\words.txt";

        LinkedHashMap<String, Integer> words = new LinkedHashMap<>();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(wordsPath))) {
            String[] wordsInFile = reader.readLine().split(" ");

            for (String s : wordsInFile) {
                words.put(s, 0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String textPath = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Exercise\\Resources\\text.txt";
        String outputPath = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Exercise\\Resources\\results.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(textPath));
             PrintWriter out = new PrintWriter(new FileWriter(outputPath))) {

            String line = reader.readLine();

            while(line != null){
                String[] splitLine = line.split(" ");

                for (String s : splitLine) {
                    if(words.containsKey(s)){
                        words.put(s, words.get(s) + 1);
                    }
                }

                line = reader.readLine();
            }

            LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

            words.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

            for (String s : sortedMap.keySet()) {
                out.printf("%s - %s%n", s, sortedMap.get(s));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
