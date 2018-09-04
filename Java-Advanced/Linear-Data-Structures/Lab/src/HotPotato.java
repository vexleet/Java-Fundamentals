import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> queue = new ArrayDeque<>();

        Collections.addAll(queue, input);

        int n = Integer.parseInt(scanner.nextLine());

        while(queue.size() > 1){
            for(int i = 1; i < n; i++){
                queue.add(queue.poll());
            }

            System.out.println("Removed " + queue.poll());
        }

        System.out.println("Last is " + queue.poll());
    }
}
