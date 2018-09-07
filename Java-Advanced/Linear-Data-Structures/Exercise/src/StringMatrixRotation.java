import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rotateInput = scanner.nextLine().split("[()]");

        String input = scanner.nextLine();
        int currentMaxLengthWord = -1;
        List<String> words = new ArrayList<>();

        while(!input.equals("END")){
            if(input.length() > currentMaxLengthWord){
                currentMaxLengthWord = input.length();
            }

            words.add(input);

            input = scanner.nextLine();
        }

        String[][] matrixWords = new String[words.size()][currentMaxLengthWord];

        for (int i = 0; i < matrixWords.length; i++) {
            for (int j = 0; j < currentMaxLengthWord; j++) {
                try{
                    String currentWord = words.get(i);
                    matrixWords[i][j] = Character.toString(currentWord.charAt(j));
                }
                catch (Exception e){
                    matrixWords[i][j] = " ";
                }
            }
        }

        int numberOfRotations = Integer.valueOf(rotateInput[1]) / 90;

        for (int i = 0; i < numberOfRotations; i++) {
            matrixWords = rotateMatrixBy90DegreeClockwise(matrixWords);
        }

        printMatrix(matrixWords);
    }
    private static String[][] rotateMatrixBy90DegreeClockwise(String[][] matrix) {

        int totalRowsOfRotatedMatrix = matrix[0].length; //Total columns of Original Matrix
        int totalColsOfRotatedMatrix = matrix.length; //Total rows of Original Matrix

        String[][] rotatedMatrix = new String[totalRowsOfRotatedMatrix][totalColsOfRotatedMatrix];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                rotatedMatrix[j][ (totalColsOfRotatedMatrix-1)- i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }

    private static void printMatrix(String[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
