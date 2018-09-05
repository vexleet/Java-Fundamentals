import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = GenerateMatrix(rows, cols);

        PrintMatrix(matrix);
    }

    public static String[][] GenerateMatrix(int rows, int cols) {
        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            char startLetter = 'a';
            startLetter += i;
            for (int j = 0; j < cols; j++) {
                char middleLetter = startLetter;
                middleLetter += j;
                String palindrome = Character.toString(startLetter)
                        + Character.toString(middleLetter) + Character.toString(startLetter);

                matrix[i][j] = palindrome;
            }
        }

        return matrix;
    }

    public static void PrintMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
