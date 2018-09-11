import java.util.LinkedHashMap;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> emails = new LinkedHashMap<>();

        while(true){
            String name = scanner.nextLine();

            if(name.equals("stop")){
                break;
            }

            String email = scanner.nextLine();
            String[] splitEmail = email.split("\\.");

            String domain = splitEmail[splitEmail.length - 1].toLowerCase();

            if(!domain.equals("us") && !domain.equals("uk") && !domain.equals("com")){
                emails.put(name, email);
            }
        }

        for (String s : emails.keySet()) {
            System.out.printf("%s -> %s%n", s, emails.get(s));
        }
    }
}
