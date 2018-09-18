import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LineNumbers {
    public static void main(String[] args) {
        String inputPath = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Exercise\\Resources\\inputLineNumbers.txt";
        String outputPath = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Exercise\\Resources\\output.txt";

        int counter = 1;

        try(BufferedReader reader = Files.newBufferedReader(Paths.get(inputPath));
            PrintWriter out = new PrintWriter(new FileWriter(outputPath))){
            String line = reader.readLine();

            while(line != null){
                out.printf("%s. %s%n", counter, line);

                counter++;
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
