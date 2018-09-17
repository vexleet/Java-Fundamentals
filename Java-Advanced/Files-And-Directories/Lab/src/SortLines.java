import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) {
        Path inputPath = Paths.get("D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Lab\\Files\\input.txt");
        Path outputPath = Paths.get("D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Lab\\Files\\output.txt");

        try {
            List<String> lines = Files.readAllLines(inputPath);

            Collections.sort(lines);
            Files.write(outputPath, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
