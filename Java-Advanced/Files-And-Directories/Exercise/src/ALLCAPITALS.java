import java.io.*;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ALLCAPITALS {
    public static void main(String[] args) {
        String inputPath = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Exercise\\Resources\\input.txt";
        String outputPath = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Exercise\\Resources\\output.txt";

        try(BufferedReader reader = Files.newBufferedReader(Paths.get(inputPath));
            PrintWriter out = new PrintWriter(new FileWriter(outputPath))){
            String line = reader.readLine();

            while (line != null){
                out.println(line.toUpperCase());

                line = reader.readLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
