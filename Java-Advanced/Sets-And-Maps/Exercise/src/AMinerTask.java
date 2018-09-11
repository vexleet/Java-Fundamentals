import java.util.LinkedHashMap;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        while(true){
            String currentResource = scanner.nextLine();

            if(currentResource.equals("stop")){
                break;
            }

            int quantity = Integer.valueOf(scanner.nextLine());

            if(!resources.containsKey(currentResource)){
                resources.put(currentResource, quantity);
            }
            else{
                resources.put(currentResource, resources.get(currentResource) + quantity);
            }
        }

        for (String resource : resources.keySet()) {
            System.out.printf("%s -> %s%n", resource, resources.get(resource));
        }
    }
}
