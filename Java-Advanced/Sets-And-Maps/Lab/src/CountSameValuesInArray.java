import java.util.HashMap;
import java.util.Scanner;

public class CountSameValuesInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        HashMap<String, Integer> result = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            String  currentNumber = numbers[i];

            if(!result.containsKey(currentNumber)){
                result.put(currentNumber, 1);
            }
            else{
                result.put(currentNumber, result.get(currentNumber) + 1);
            }
        }

        for (String number : result.keySet()) {
            System.out.println(number + " - " + result.get(number) + " times");
        }
    }
}
