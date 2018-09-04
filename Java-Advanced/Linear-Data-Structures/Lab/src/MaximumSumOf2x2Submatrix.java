import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixCount = scanner.nextLine().split(", ");

        int[][] matrix = new int[Integer.parseInt(matrixCount[0])][Integer.parseInt(matrixCount[1])];
        int bestSum = Integer.MIN_VALUE;
        int[] firstRow = new int[2];
        int[] secondRow = new int[2];

        for(int i = 0; i < matrix.length; i++){
            String[] reminder = scanner.nextLine().split(", ");
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = Integer.parseInt(reminder[j]);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int currentSum = 0;
                try{
                    currentSum += matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];

                    if(currentSum > bestSum){
                        bestSum = currentSum;
                        firstRow[0] = matrix[i][j];
                        firstRow[1] = matrix[i][j + 1];
                        secondRow[0] = matrix[i + 1][j];
                        secondRow[1] = matrix[i + 1][j + 1];
                    }
                }
                catch (IndexOutOfBoundsException e){}
            }
        }

        System.out.printf("%s %s%n", firstRow[0], firstRow[1]);
        System.out.printf("%s %s%n", secondRow[0], secondRow[1]);
        System.out.println(bestSum);


    }
}