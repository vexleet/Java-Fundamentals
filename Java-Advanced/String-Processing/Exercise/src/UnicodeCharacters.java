import java.util.Scanner;

public class UnicodeCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for(int i = 0; i < text.length(); i++){
            System.out.print( "\\u" + Integer.toHexString(text.charAt(i) | 0x10000).substring(1) );
        }
    }
}
