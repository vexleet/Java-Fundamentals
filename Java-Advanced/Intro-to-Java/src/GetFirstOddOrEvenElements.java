import java.util.ArrayList;
import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        String[] input = scanner.nextLine().split(" ");

        int numberOfElements = Integer.parseInt(input[1]);
        String typeOfElement = input[2].toLowerCase();

        int counter = 0;

        for(int i = 0; i < array.length; i++){
            int current = Integer.parseInt(array[i]);

            if(typeOfElement.equals("even")) {
                if(current % 2 == 0){
                    System.out.print(current + " ");
                    counter++;
                }
            }
            else if(typeOfElement.equals("odd")){
                if(current % 2 != 0){
                    System.out.print(current + " ");
                    counter++;
                }
            }

            if(counter == numberOfElements){
                break;
            }
        }
    }
}
