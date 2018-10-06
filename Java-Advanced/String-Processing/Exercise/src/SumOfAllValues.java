import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfAllValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String keyString = scanner.nextLine();
        String textString = scanner.nextLine();

        double sum = 0;

        Pattern startKeyStringPattern = Pattern.compile("^[A-Za-z_]+(?=[0-9])");
        Pattern endKeyStringPattern = Pattern.compile("(?<=[0-9])[A-Za-z_]+$");

        Matcher startKeyStringMatcher = startKeyStringPattern.matcher(keyString);
        Matcher endKeyStringMatcher = endKeyStringPattern.matcher(keyString);

        if(startKeyStringMatcher.find() && endKeyStringMatcher.find()){
            Pattern patternForText = Pattern.compile(startKeyStringMatcher.group(0) + "(.*?)" + endKeyStringMatcher.group(0));
            Matcher matcherForText = patternForText.matcher(textString);

            while(matcherForText.find()){
                try{
                    if(!matcherForText.group(1).contains(",")) {
                        double number = Double.parseDouble(matcherForText.group(1));
                        sum += number;
                    }
                }
                catch (Exception e){}
            }
        }
        else{
            System.out.println("<p>A key is missing</p>");
            return;
        }

        if(sum == 0.0){
            System.out.println("<p>The total value is: <em>nothing</em></p>");
        }
        else{
            if ((sum == Math.floor(sum)) && !Double.isInfinite(sum)) {
                System.out.format("<p>The total value is: <em>%.0f</em></p>", sum);
            }
            else {
                System.out.format("<p>The total value is: <em>%.2f</em></p>", sum);
            }
        }
    }
}