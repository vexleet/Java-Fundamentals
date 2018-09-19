import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentsResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([A-Za-z]+) - (\\d+\\.\\d+|\\d+), (\\d+\\.\\d+|\\d+), (\\d+\\.\\d+|\\d+)");

        Matcher matcher = pattern.matcher(input);

        if(matcher.matches()){
            String name = matcher.group(1);
            List<Double> results = new ArrayList<>();

            Collections.addAll(results, Double.valueOf(matcher.group(2)),
                    Double.valueOf(matcher.group(3)), Double.valueOf(matcher.group(4)));

            double average = (results.get(0) + results.get(1) + results.get(2)) / 3;

            System.out.println(
                    String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|",
                            "Name", "JAdv", "JavaOOP", "AdvOOP", "Average"));

            System.out.println(
                    String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|",
                            name, results.get(0), results.get(1), results.get(2),average));

        }
    }
}