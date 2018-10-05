import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LetterChangeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bigAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();

        List<String> input = new ArrayList<String>(Arrays.asList(scanner.nextLine().split("[ \t]+")));
        input.removeAll(Arrays.asList("", ""));
        double sum = 0;

        for (int i = 0; i < input.size(); i++)
        {
            char firstLetter = input.get(i).charAt(0);
            char lastLetter = input.get(i).charAt(input.get(i).length() - 1);
            double number = Double.parseDouble(input.get(i).substring(1, input.get(i).length() - 1));
            double result = 0;

            if(firstLetter > 90)
            {
                int positionOfLetter = smallAlpha.indexOf(firstLetter) + 1;
                result = number * positionOfLetter;
            }
            else
            {
                int positionOfLetter = bigAlpha.indexOf(firstLetter) + 1;
                result = number / positionOfLetter;
            }

            if (lastLetter > 90)
            {
                int positionOfLetter = smallAlpha.indexOf(lastLetter) + 1;
                result += positionOfLetter;
            }
            else
            {
                int positionOfLetter = bigAlpha.indexOf(lastLetter) + 1;
                result -= positionOfLetter;
            }

            sum += result;

        }

        System.out.format("%.2f", sum);
    }
}
