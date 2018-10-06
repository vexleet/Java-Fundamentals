import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Map<Character, Character> map = new LinkedHashMap<>();

        String firstString = input[0];
        String secondString = input[1];

        if(firstString.length() >= secondString.length()){
            checkStrings(firstString, secondString);
        }
        else{
            checkStrings(secondString, firstString);
        }
    }

    public static void checkStrings(String firstString, String secondString){
        Map<Character, Character> map = new LinkedHashMap<>();

        for(int i = 0; i < secondString.length(); i++) {
            char firstStringCharacter = firstString.charAt(i);
            char secondStringCharacter = secondString.charAt(i);

            if(!map.containsKey(firstStringCharacter)){
                map.put(firstStringCharacter, secondStringCharacter);
            }
            else if(!map.get(firstStringCharacter).equals(secondStringCharacter)){
                System.out.println(false);
                return;
            }
        }

        for(int i = secondString.length(); i < firstString.length(); i++){
            char firstWordChar = firstString.charAt(i);

            if(!map.containsKey(firstWordChar)){
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }
}