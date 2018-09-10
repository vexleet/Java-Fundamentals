import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class PopulationCounter {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, Long>> countries = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");

        while(!input[0].equals("report")){
            String city = input[0];
            String country = input[1];
            long population = Long.parseLong(input[2]);

            if(countries.containsKey(country) == false){
                countries.put(country, new HashMap<>());
            }

            if(countries.get(country).containsKey(city) == false){
                countries.get(country).put(city, population);
            }
            else{
                countries.get(country).put(city, countries.get(country).get(city) + population);
            }

            input = scanner.nextLine().split("\\|");
        }

        var sortCountries = new TreeMap(Collections.reverseOrder());
        sortCountries.putAll(countries);

        for (Object state : sortCountries.keySet()) {
            System.out.println();
        }
    }
}
