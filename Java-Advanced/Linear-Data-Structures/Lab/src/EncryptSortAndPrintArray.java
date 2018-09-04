import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] array = new String[n];
        int[] encryptedStrings = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = scanner.nextLine();
        }

        for(int i = 0; i < array.length; i++){
            String currentString = array[i];
            int sum = 0;

            for(int j = 0; j < currentString.length(); j++){
                char letter = currentString.charAt(j);

                if("aeiou".indexOf(currentString.toLowerCase().charAt(j)) < 0){
                    sum += letter / currentString.length();
                }
                else{
                    sum += letter * currentString.length();
                }
            }

            encryptedStrings[i] = sum;
        }

        Arrays.sort(encryptedStrings);

        for(int i = 0; i < encryptedStrings.length; i++){
            System.out.println(encryptedStrings[i]);
        }
    }
}
