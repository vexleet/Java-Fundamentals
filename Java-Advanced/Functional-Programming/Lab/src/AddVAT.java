import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        List<Double> numbers = new ArrayList<>();

        for(String s : input){
            numbers.add(Double.valueOf(s));
        }

        UnaryOperator<Double> addVat = x -> x * 1.2;
        System.out.println("Prices with VAT:");
        for(Double n : numbers){
            System.out.println(String.format("%1$.2f", addVat.apply(n)));
        }
    }
}
