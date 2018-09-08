import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        TreeSet<String> guests = new TreeSet<>();

        while(!command.equals("PARTY")){
            guests.add(command);

            command = scanner.nextLine();
        }

        command = scanner.nextLine();

        while(!command.equals("END")){
            guests.remove(command);

            command = scanner.nextLine();
        }

        System.out.println(guests.size());
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
