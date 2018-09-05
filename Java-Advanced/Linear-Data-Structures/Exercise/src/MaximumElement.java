import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int commandsNum = Integer.parseInt(reader.readLine());

        Deque<Integer> stack = new ArrayDeque<>(), maxStack = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();

        int maxNumber = 0;

        for (int i = 0; i < commandsNum; i++) {
            String[] input = reader.readLine().split(" ");

            if (input[0].equals("1")) {
                int value = Integer.valueOf(input[1]);
                if (maxNumber <= value) {
                    maxNumber = value;
                    maxStack.push(maxNumber);
                }
                stack.push(value);
            } else if (input[0].equals("2")) {
                if (stack.pop() == maxNumber) {
                    maxStack.pop();
                    if (maxStack.size() > 0) {
                        maxNumber = maxStack.peek();
                    } else {
                        maxNumber = 0;
                    }
                }
            } else {
                sb.append(maxNumber).append(System.lineSeparator());
            }
        }
        System.out.println(sb);
    }
}