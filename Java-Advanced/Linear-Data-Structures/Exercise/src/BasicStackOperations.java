import java.util.Scanner;
import java.util.Stack;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stackSize = scanner.nextInt();
        int eleToPop = scanner.nextInt();
        int eleToCheck = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < stackSize; i++){
            int currentNumber = scanner.nextInt();

            stack.push(currentNumber);
        }

        for(int i = 0; i < eleToPop; i++){
            stack.pop();
        }

        if(stack.isEmpty()){
            System.out.println(0);
        }
        else if(stack.contains(eleToCheck)){
            System.out.println(true);
        }
        else{
            int smallestNumber = stack.get(0);

            for (int i = 1; i < stack.size(); i++) {
                if(stack.get(i) < smallestNumber){
                    smallestNumber = stack.get(i);
                }
            }

            System.out.println(smallestNumber);
        }
    }
}
