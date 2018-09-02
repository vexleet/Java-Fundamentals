import java.util.Scanner;

public class BlurFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long blurAmount = scanner.nextInt();
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        long[][] array = new long[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                long currentNumber = scanner.nextInt();

                array[i][j] = currentNumber;
            }
        }

        int rowOfBlur = scanner.nextInt();
        int columnOfBlur = scanner.nextInt();

        for(int i = rowOfBlur - 1; i <= rowOfBlur + 1; i++){
            for(int j = columnOfBlur - 1; j <= columnOfBlur + 1; j++){
                try{
                    array[i][j] += blurAmount;
                }
                catch (ArrayIndexOutOfBoundsException e){}
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
