import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixCount = scanner.nextLine().split(" ");

        int[][] matrix = new int[Integer.parseInt(matrixCount[0])][Integer.parseInt(matrixCount[1])];
        int sum = Integer.MIN_VALUE;
        int rowsIndex = 0;
        int colsIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            String[] reminder = scanner.nextLine().split(" ");
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Integer.parseInt(reminder[j]);
            }
        }

        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int currentSum = 0;
                try {
                    currentSum += matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
                            + matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2]
                            +matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];

                    if (currentSum > sum) {
                        sum = currentSum;
                        rowsIndex = i;
                        colsIndex = j;
                    }
                } catch (IndexOutOfBoundsException e) {
                }
            }
        }

        System.out.println("Sum = " + sum);

        for(int i = rowsIndex; i < rowsIndex + 3; i++){
            for(int j = colsIndex; j < colsIndex + 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
