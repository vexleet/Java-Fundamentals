import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("-");

        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();

        while (!input[0].equals("search")){
            String name = input[0];
            String phoneNumber = input[1];

            phonebook.put(name, phoneNumber);

            input = scanner.nextLine().split("-");
        }

        String searchInput = scanner.nextLine();

        while (!searchInput.equals("stop")){

            if(phonebook.containsKey(searchInput)){
                System.out.printf("%s -> %s %n", searchInput, phonebook.get(searchInput));
            }
            else{
                System.out.printf("Contact %s does not exist.%n", searchInput);
            }

            searchInput = scanner.nextLine();
        }
    }
}
