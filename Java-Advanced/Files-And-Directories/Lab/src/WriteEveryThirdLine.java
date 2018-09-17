import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String inputPath = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Lab\\Files\\input.txt";
        String outputPath = "D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Lab\\Files\\output.txt";


        try( BufferedReader in = new BufferedReader(new FileReader(inputPath));
             PrintWriter out = new PrintWriter(new FileWriter(outputPath));){
            int counter = 1;

            String line = in.readLine();

            while(line != null){
                if(counter % 3 == 0){
                    out.println(line);
                }

                counter++;
                line = in.readLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();

        }
    }
}
