import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Lab\\Files\\input.txt";

        Scanner reader = new Scanner(new FileInputStream(path));

        while(reader.hasNext()){
            if (reader.hasNextInt()) {
                System.out.println(reader.nextInt());
            }

            reader.next();
        }
    }
}
