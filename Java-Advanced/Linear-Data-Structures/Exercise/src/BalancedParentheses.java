import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        checkForBalancedParentheses(input);

    }

    public static void checkForBalancedParentheses(String array){
        Stack<String> stack = new Stack<>();
        boolean balancedParentheses = true;

        for (int i = 0; i < array.length(); i++) {
            String currentParentheses = Character.toString(array.charAt(i));

            if(currentParentheses.equals("(")
                    || currentParentheses.equals("[") || currentParentheses.equals("{")){
                stack.add(currentParentheses);
            }
            else if(currentParentheses.equals(")")){
                try {
                    String lastParentheses = stack.pop();

                    if (!lastParentheses.equals("(")) {
                        balancedParentheses = false;
                    }
                }
                catch (EmptyStackException e){
                    balancedParentheses = false;
                }
            }
            else if(currentParentheses.equals("]")){
                try {
                    String lastParentheses = stack.pop();

                    if (!lastParentheses.equals("[")) {
                        balancedParentheses = false;
                    }
                }
                catch (EmptyStackException e){
                    balancedParentheses = false;
                }
            }
            else if(currentParentheses.equals("}")){
                try {
                    String lastParentheses = stack.pop();

                    if (!lastParentheses.equals("{")) {
                        balancedParentheses = false;
                    }
                }
                catch (EmptyStackException e){
                    balancedParentheses = false;
                }
            }

            if(!balancedParentheses){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");

    }
}