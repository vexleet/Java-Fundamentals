import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();

        String token = scanner.nextLine();

        for(String t : token.split(" ")){
            array.add(Integer.parseInt(t));
        }

        if(array.size() % 2 == 1){
            System.out.println("invalid length");
        }
        else{
            for(int i = 0; i < array.size(); i+=2){
                int current = array.get(i);
                int next = array.get(i + 1);

                if(current % 2 == 0 && next % 2 == 0){
                    System.out.printf("%s, %s -> both are even%n", current, next);
                }
                else if(current % 2 != 0 && next % 2 != 0){
                    System.out.printf("%s, %s -> both are odd%n", current, next);
                }
                else{
                    System.out.printf("%s, %s -> different%n", current, next);
                }
            }
        }
    }
}
