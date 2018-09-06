import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfOperations = Integer.valueOf(scanner.nextLine());

        Stack<String> commandsSave = new Stack<>();

        String text = "";

        for (int i = 0; i < numberOfOperations; i++) {
            String[] command = scanner.nextLine().split(" ");

            if(command[0].equals("1")){
                text += command[1];

                commandsSave.add(text);
            }
            else if(command[0].equals("2")){
                int lettersToDelete = Integer.parseInt(command[1]);
                text = text.substring(0, text.length() - lettersToDelete);

                commandsSave.add(text);
            }
            else if(command[0].equals("3")){
                int charPositionToPrint = Integer.parseInt(command[1]) - 1;
                char charToPrint = text.charAt(charPositionToPrint);

                System.out.println(charToPrint);
            }
            else if(command[0].equals("4")){
                try {
                    commandsSave.pop();

                    text = commandsSave.peek();
                }
                catch (Exception e){
                    text = "";
                }
            }
        }
    }
}
