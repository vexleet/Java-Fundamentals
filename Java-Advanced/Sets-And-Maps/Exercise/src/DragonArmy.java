import java.util.*;

public class DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, TreeMap<String, List<Integer>>> dragons = new LinkedHashMap<>();

        int numberOfDragons = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < numberOfDragons; i++) {
            String[] currentDragon = scanner.nextLine().split(" ");

            String typeOfDragon = currentDragon[0];
            String nameOfDragon = currentDragon[1];
            List<Integer> statsOfDragon = GetStatsOfDragon(currentDragon);

            if(!dragons.containsKey(typeOfDragon)){
                dragons.put(typeOfDragon, new TreeMap<>());
            }
            if(dragons.containsKey(typeOfDragon) && dragons.get(typeOfDragon).containsKey(nameOfDragon)){
                dragons.get(typeOfDragon).put(nameOfDragon, statsOfDragon);
            }
            else{
                dragons.get(typeOfDragon).put(nameOfDragon, statsOfDragon);
            }
        }

        for (String drake : dragons.keySet()) {
            List<List<Integer>> totalStats = new ArrayList<>(dragons.get(drake).values());

            double totalDamageAverage = SumElements(totalStats, 0);
            double totalHealthAverage = SumElements(totalStats, 1);
            double totalArmorAverage = SumElements(totalStats,2);

            System.out.printf("%s::(%1.2f/%1.2f/%1.2f)%n", drake, totalDamageAverage, totalHealthAverage, totalArmorAverage);

            for (String nameOfDragon : dragons.get(drake).keySet()) {
                System.out.printf("-%s -> damage: %s, health: %s, armor: %s%n",
                        nameOfDragon, dragons.get(drake).get(nameOfDragon).get(0),
                        dragons.get(drake).get(nameOfDragon).get(1),
                        dragons.get(drake).get(nameOfDragon).get(2));
            }
        }
    }

    public static double SumElements(List<List<Integer>> elements, int index){
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < elements.size(); i++) {
            result.add(elements.get(i).get(index));
        }

        return result.stream().mapToDouble(val -> val).average().getAsDouble();
    }

    public static List<Integer> GetStatsOfDragon(String[] stats){
        List<Integer> result = new ArrayList<>();
        String damage = stats[2];
        String health = stats[3];
        String armor = stats[4];

        for(int i = 2; i < stats.length; i++){
            if(stats[i].equals("null") && i == 2){
                damage = "45";
            }
            else if(stats[i].equals("null") && i == 3){
                health = "250";
            }
            else if(stats[i].equals("null") && i == 4){
                armor = "10";
            }
        }

        result.add(Integer.valueOf(damage));
        result.add(Integer.valueOf(health));
        result.add(Integer.valueOf(armor));

        return result;
    }
}