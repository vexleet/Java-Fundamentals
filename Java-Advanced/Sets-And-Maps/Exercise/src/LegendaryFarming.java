import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Integer> keyMaterials = new TreeMap<>(){
            {
                put("shards", 0);
                put("fragments", 0);
                put("motes", 0);
            }
        };

        TreeMap<String, Integer> junkMaterials = new TreeMap<>();

        int shadowmourneCounter = 0;
        int valanyrCounter = 0;
        int dragonwrathCounter = 0;
        String obtainedItem = "";

        String[] input = scanner.nextLine().toLowerCase().split(" ");

        while (true) {
            for (int i = 0; i < input.length; i+= 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1];

                if(material.equals("shards")){
                    shadowmourneCounter += quantity;

                    if(shadowmourneCounter >= 250){
                        shadowmourneCounter -= 250;
                        obtainedItem = "Shadowmourne";
                        break;
                    }
                }
                else if (material.equals("fragments"))
                {
                    valanyrCounter += quantity;
                    if (valanyrCounter >= 250)
                    {
                        valanyrCounter -= 250;
                        obtainedItem = "Valanyr";
                        break;
                    }
                }
                else if (material.equals("motes"))
                {
                    dragonwrathCounter += quantity;
                    if (dragonwrathCounter >= 250)
                    {
                        dragonwrathCounter -= 250;
                        obtainedItem = "Dragonwrath";
                        break;
                    }
                }
                else
                {
                    if (!junkMaterials.containsKey(material))
                    {
                        junkMaterials.put(material, quantity);
                    }
                    else
                    {
                        junkMaterials.put(material, junkMaterials.get(material) + quantity);
                    }
                }
            }

            if(!obtainedItem.equals("")){
                break;
            }

            input = scanner.nextLine().toLowerCase().split(" ");
        }

        keyMaterials.put("shards", shadowmourneCounter);
        keyMaterials.put("fragments", valanyrCounter);
        keyMaterials.put("motes", dragonwrathCounter);
        System.out.printf("%s obtained!%n", obtainedItem);

        keyMaterials.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).forEach(entry -> {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        });

        for (String material : junkMaterials.keySet()) {
            System.out.printf("%s: %s%n", material, junkMaterials.get(material));
        }
    }


}
