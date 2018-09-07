import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = Integer.valueOf(scanner.nextLine());

        System.out.println(fib(number, 1, 1));
    }

    static long fib(long n, long a, long b )
    {

        if (n == 0)
            return a;
        if (n == 1)
            return b;
        return fib(n - 1, b, a + b);
    }
}