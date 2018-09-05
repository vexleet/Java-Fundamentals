import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stackSize = scanner.nextInt();
        int eleToPop = scanner.nextInt();
        int eleToCheck = scanner.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < stackSize; i++){
            int currentNumber = scanner.nextInt();

            stack.add(currentNumber);
        }

        for(int i = 0; i < eleToPop; i++){
            stack.poll();
        }

        if(stack.isEmpty()){
            System.out.println(0);
        }
        else if(stack.contains(eleToCheck)){
            System.out.println(true);
        }
        else{
            System.out.println(Collections.min(stack));
        }
    }
}
