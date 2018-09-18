import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumBytes {
    public static void main(String[] args) {
        String inputPath = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Exercise\\Resources\\input.txt";

        BigInteger sum = new BigInteger("0");

        try(BufferedReader reader = Files.newBufferedReader(Paths.get(inputPath))){
            String line = reader.readLine();

            while(line != null){

                for (char c : line.toCharArray()) {
                    sum = sum.add(BigInteger.valueOf(c));
                }

                line = reader.readLine();
            }
            System.out.println(sum);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
