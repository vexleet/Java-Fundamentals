import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int matrixSize = Integer.parseInt(input[0]);
        String matrixPattern = input[1];
        int[][] matrix = new int[matrixSize][matrixSize];

        if(matrixPattern.equals("A")){
            matrix = PatternA(matrixSize);
        }
        else if(matrixPattern.equals("B")){
            matrix = PatternB(matrixSize);
        }

        PrintMatrix(matrix);
    }

    public static int[][] PatternA(int size){
        int[][] finalMatrix = new int[size][size];
        int matrixCounter = 1;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                finalMatrix[j][i] = matrixCounter;
                matrixCounter++;
            }
        }

        return finalMatrix;
    }

    public static int[][] PatternB(int size){
        int[][] finalMatrix = new int[size][size];
        int matrixCounter = 1;

        for(int i = 0; i < size; i++){

            if(i % 2 == 0){
                for (int j = 0; j < size; j++) {
                    finalMatrix[j][i] = matrixCounter;
                    matrixCounter++;
                }
            }
            else {
                for (int j = size - 1; j >= 0; j--) {
                    finalMatrix[j][i] = matrixCounter;
                    matrixCounter++;
                }
            }
        }

        return finalMatrix;
    }

    public static void PrintMatrix(int[][] matrix){

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
