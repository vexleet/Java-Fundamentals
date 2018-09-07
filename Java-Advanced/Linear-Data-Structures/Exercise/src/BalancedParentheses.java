import java.util.Scanner;
//75/100
public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if(input.length() % 2 != 0){
            checkForBalancedParentheses(input, input.length() / 2 + 1);
        }
        else {
            checkForBalancedParentheses(input, input.length() / 2);
        }

    }

    public static void checkForBalancedParentheses(String array, int length){
        for (int i = 0; i < length; i++) {
            String firstParanthes = Character.toString(array.charAt(i));
            String secondParanthes = Character.toString(array.charAt(array.length() - 1 - i));

            if (!(firstParanthes.equals("{") && secondParanthes.equals("}"))
                    && !(firstParanthes.equals("[") && secondParanthes.equals("]")) &&
                    !(firstParanthes.equals("(") && secondParanthes.equals(")"))) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");

    }
}
