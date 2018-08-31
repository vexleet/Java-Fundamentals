import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        String aToHex = Integer.toHexString(a).toUpperCase();
        String aToBinary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');


        System.out.printf("|%-10s|%-10s|%10.2f|%-10.3f|", aToHex, aToBinary, b, c);
    }
}
