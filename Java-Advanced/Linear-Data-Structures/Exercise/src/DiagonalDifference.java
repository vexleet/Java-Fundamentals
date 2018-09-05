import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for(int i = 0; i < size; i++){
            String[] currentRow = scanner.nextLine().split(" ");
            for(int j = 0; j < size; j++){
                matrix[i][j] = Integer.parseInt(currentRow[j]);
            }
        }

        System.out.println(DiagonalDifference(matrix));
    }

    public static int DiagonalDifference(int[][] matrix){
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for(int i = 0; i < matrix.length; i++){
            primaryDiagonalSum += matrix[i][i];
        }

        for(int j = 0; j < matrix.length; j++){
            secondaryDiagonalSum += matrix[j][matrix.length - 1 - j];
        }

        int difference = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);

        return difference;
    }
}
