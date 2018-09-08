import java.util.*;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayer = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondPlayer = new LinkedHashSet<>();

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            firstPlayer.add(Integer.valueOf(input[i]));
        }

        input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            secondPlayer.add(Integer.valueOf(input[i]));
        }

        for (int i = 0; i < 50; i++) {
            int firstNumber = firstPlayer.iterator().next();
            firstPlayer.remove(firstNumber);

            int secondNumber = secondPlayer.iterator().next();
            secondPlayer.remove(secondNumber);

            if(firstNumber > secondNumber){
                firstPlayer.add(firstNumber);
                firstPlayer.add(secondNumber);
            }
            else if(secondNumber > firstNumber){
                secondPlayer.add(firstNumber);
                secondPlayer.add(secondNumber);
            }

            if(firstPlayer.isEmpty()){
                System.out.println("Second player win!");
                return;
            }
            else if(secondPlayer.isEmpty()){
                System.out.println("First player win!");
                return;
            }
        }

        if(firstPlayer.size() > secondPlayer.size()){
            System.out.println("First player win!");
        }
        else if(secondPlayer.size() > firstPlayer.size()){
            System.out.println("Second player win!");
        }
        else {
            System.out.println("Draw!");
        }
    }
}
