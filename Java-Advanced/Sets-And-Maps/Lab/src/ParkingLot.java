import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        HashSet<String> cars = new HashSet<>();

        while(!input[0].equals("END")){
            if(input[0].equals("IN")){
                String carNumber = input[1];

                cars.add(carNumber);
            }
            else{
                String carNumber = input[1];

                cars.remove(carNumber);
            }

            input = scanner.nextLine().split(", ");
        }

        if(cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }
        else{
            for (String car : cars) {
                System.out.println(car);
            }
        }
    }
}
