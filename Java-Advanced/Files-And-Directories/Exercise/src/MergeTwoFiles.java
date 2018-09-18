import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MergeTwoFiles {
    public static void main(String[] args) {
        String inputPathOne = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Exercise\\Resources\\inputOne.txt";
        String inputPathTwo = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Exercise\\Resources\\inputTwo.txt";
        String outputPath = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Exercise\\Resources\\outputThree.txt";

        try (BufferedReader readerOne = Files.newBufferedReader(Paths.get(inputPathOne));
             BufferedReader readerTwo = Files.newBufferedReader(Paths.get(inputPathTwo));
             PrintWriter out = new PrintWriter(new FileWriter(outputPath))) {

            String line1 = readerOne.readLine();
            String line2 = readerTwo.readLine();

            while (line1 != null || line2 != null) {

                if(line1 != null)
                {
                    out.println(line1);
                    line1 = readerOne.readLine();
                }

                else if(line2 != null)
                {
                    out.println(line2);
                    line2 = readerTwo.readLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
