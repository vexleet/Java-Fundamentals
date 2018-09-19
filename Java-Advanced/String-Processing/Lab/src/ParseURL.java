import java.util.Scanner;

public class ParseURL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("://");

        if(input.length > 2 || input.length < 2){
            System.out.println("Invalid URL");
            return;
        }

        String protocol = input[0];

        int serverEndIndex = input[1].indexOf('/');
        String server = input[1].substring(0, serverEndIndex);
        String resources = input[1].substring(serverEndIndex + 1, input[1].length());

        System.out.printf("Protocol = %s%n", protocol);
        System.out.printf("Server = %s%n", server);
        System.out.printf("Resources = %s%n", resources);
    }
}