import java.util.*;

public class PopulationCounter {
    public static void main(String[] args) {
        Map<String, Map<String, Long>> countries = new LinkedHashMap<>();

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");

        while(!input[0].equals("report")){
            String city = input[0];
            String country = input[1];
            long population = Long.parseLong(input[2]);

            if(countries.containsKey(country) == false){
                countries.put(country, new LinkedHashMap<>());
            }

            countries.get(country).put(city, population);

            input = scanner.nextLine().split("\\|");
        }

        countries.entrySet().stream()
                .sorted((country1, country2) -> country2.getValue().values().stream().reduce(0L, Long::sum)
                        .compareTo(country1.getValue().values().stream().reduce(0L, Long::sum)))
                .forEach(country -> {
                    System.out.printf("%s (total population: %d)%n", country.getKey(),
                            country.getValue().values().stream().reduce(0L, Long::sum));
                    country.getValue().entrySet().stream()
                            .sorted((city1, city2) -> city2.getValue().compareTo(city1.getValue()))
                            .forEach(city -> System.out.printf("=>%s: %d%n", city.getKey(), city.getValue()));
                });
    }
}
