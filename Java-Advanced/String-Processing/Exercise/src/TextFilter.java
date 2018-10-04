import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsToCensor = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for(int i = 0; i < wordsToCensor.length; i++){
            text = text.replaceAll(wordsToCensor[i],  new String(new char[wordsToCensor[i].length()]).replace("\0", "*"));
        }

        System.out.println(text);
    }
}
