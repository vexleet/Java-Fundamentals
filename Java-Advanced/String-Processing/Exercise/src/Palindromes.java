import java.util.Scanner;
import java.util.TreeSet;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("[ ,.!?]+");
        TreeSet<String> palindromes = new TreeSet<>();

        for(int i = 0; i < text.length; i++){
            char[] wordToReverse = text[i].toCharArray();

            for(int j=0; j<wordToReverse.length/2; j++){
                char temp = wordToReverse[j];
                wordToReverse[j] = wordToReverse[wordToReverse.length -j -1];
                wordToReverse[wordToReverse.length -j -1] = temp;
            }

            String word = String.valueOf(wordToReverse);

            if(word.equals(text[i])){
                palindromes.add(word);
            }
        }

        System.out.println(palindromes);
    }
}
