import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) {
        String inputPath = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Lab\\Files\\input.txt";
        String outputPath = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Lab\\Files\\output.txt";

        List<Character> symbols = new ArrayList<>();
        Collections.addAll(symbols, '.', ',', '!', '?');

        try(InputStream in = new FileInputStream(inputPath);
            OutputStream out = new FileOutputStream(outputPath)){
            int oneByte = in.read();

            while(oneByte >= 0){

                if(!symbols.contains((char)oneByte)){
                    out.write(oneByte);
                }

                oneByte = in.read();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
