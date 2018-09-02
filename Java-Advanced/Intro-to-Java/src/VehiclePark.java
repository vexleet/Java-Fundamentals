import java.util.Arrays;
import java.util.Scanner;

public class VehiclePark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] availableVehicles = scanner.nextLine().split(" ");
        String[] newArr = null;
        int soldVehicles = 0;

        String input = scanner.nextLine();
        while(!input.equals("End of customers!")){
            String[] currentCustomer = input.split(" ");
            char typeOfvehicle = currentCustomer[0].toLowerCase().charAt(0);
            int seatsRequired = Integer.parseInt(currentCustomer[2]);

            String desiredVehicle = typeOfvehicle + Integer.toString(seatsRequired);

            if(Arrays.asList(availableVehicles).contains(desiredVehicle)){
                int price = typeOfvehicle * seatsRequired;
                for(int i = 0; i < availableVehicles.length; i++){
                    if(availableVehicles[i].equals(desiredVehicle)){
                        newArr = new String[availableVehicles.length - 1];
                        for(int index = 0; index < i; index++){
                            newArr[index] = availableVehicles[index];
                        }
                        for(int j = i; j < availableVehicles.length - 1; j++){
                            newArr[j] = availableVehicles[j+1];
                        }
                        availableVehicles = newArr;

                        break;
                    }
                }

                soldVehicles++;
                System.out.printf("Yes, sold for %s$%n", price);
            }
            else{
                System.out.println("No");
            }

            input = scanner.nextLine();
        }

        System.out.println("Vehicles left: " + String.join(", ", availableVehicles));
        System.out.printf("Vehicles sold: %s", soldVehicles);
    }
}
