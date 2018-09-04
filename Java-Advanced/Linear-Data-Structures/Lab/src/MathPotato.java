import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> queue = new ArrayDeque<>();

        Collections.addAll(queue, input);

        int n = Integer.parseInt(scanner.nextLine());
        int cycle = 1;

        while(queue.size() > 1){
            for(int i = 1; i < n; i++){
                queue.offer(queue.poll());
            }

            if(isPrime(cycle)){
                System.out.println("Prime " + queue.peek());
            }
            else{
                System.out.println("Removed " + queue.poll());
            }

            cycle++;
        }

        System.out.println("Last is " + queue.poll());
    }

    public static boolean isPrime(int n){
        boolean isPrime = true;

        if(n < 2){
            isPrime = false;
        }

        for(int divisor = 2; divisor <= n / 2; divisor++) {
            if (n % divisor == 0) {
                isPrime = false;
                break; // num is not a prime, no reason to continue checking
            }
        }

        return isPrime;
    }
}
