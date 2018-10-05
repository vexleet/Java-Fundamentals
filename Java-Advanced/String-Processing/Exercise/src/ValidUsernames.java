import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("[ \\/\\\\()]+");
        List<String> allValidMatches = new ArrayList<>();

        String pattern = "^[a-zA-Z]\\w{2,25}$";
        Pattern p = Pattern.compile(pattern);

        for (int i = 0; i < input.length; i++) {
            Matcher m = p.matcher(input[i]);

            if(m.find()){
                allValidMatches.add(m.group(0));
            }
        }

        int biggestLength = -1;
        int indexOfBiggestElements = 0;

        for (int i = 0; i < allValidMatches.size() - 1; i++) {
            String firstMatch = allValidMatches.get(i);
            String secondMatch = allValidMatches.get(i + 1);

            int sumOfLengths = firstMatch.length() + secondMatch.length();

            if(biggestLength < sumOfLengths){
                biggestLength = sumOfLengths;
                indexOfBiggestElements = i;
            }
        }

        for(int i = indexOfBiggestElements; i < indexOfBiggestElements+ 2; i++){
            System.out.println(allValidMatches.get(i));
        }
    }
}
