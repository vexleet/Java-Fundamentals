import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Stack<String> stack = new Stack<>();

        Collections.addAll(stack, input);

        while(stack.size() > 0){
            System.out.print(stack.pop() + " ");
        }
    }
}
