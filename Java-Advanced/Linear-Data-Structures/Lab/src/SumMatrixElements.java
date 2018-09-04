import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixCount = scanner.nextLine().split(", ");

        int[][] matrix = new int[Integer.parseInt(matrixCount[0])][Integer.parseInt(matrixCount[1])];
        int sum = 0;

        for(int i = 0; i < matrix.length; i++){
            String[] reminder = scanner.nextLine().split(", ");
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = Integer.parseInt(reminder[j]);
            }
        }

        for (int[] m: matrix) {
            for(int ele : m){
                sum += ele;
            }
        }

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sum);
    }
}