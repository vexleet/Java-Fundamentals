import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNames = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < numberOfNames; i++) {
            String[] line = scanner.nextLine().split(", ");

            String name = line[0];
            int age = Integer.parseInt(line[1]);

            people.put(name, age);
        }

        String condition = scanner.nextLine();
        int requiredAge = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Map<String, Integer> result = new LinkedHashMap<>();

        Predicate<Integer> isYounger = number -> number < requiredAge;
        Predicate<Integer> isOlder = number -> number >= requiredAge;

        if(condition.equals("younger")){
            for (Map.Entry<String, Integer> entry : people.entrySet())
            {
                if(isYounger.test(entry.getValue())){
                    result.put(entry.getKey(), entry.getValue());
                }
            }
        }
        else if(condition.equals("older")){
            for (Map.Entry<String, Integer> entry : people.entrySet())
            {
                if(isOlder.test(entry.getValue())){
                    result.put(entry.getKey(), entry.getValue());
                }
            }
        }

        Consumer<String> print = typeOfFormat -> {
            if(typeOfFormat.equals("name")){
                for(Map.Entry<String, Integer> entry : result.entrySet()){
                    System.out.println(entry.getKey());
                }
            }
            else if(typeOfFormat.equals("age")){
                for(Map.Entry<String, Integer> entry : result.entrySet()){
                    System.out.println(entry.getValue());
                }
            }
            else if(typeOfFormat.equals("name age")){
                for(Map.Entry<String, Integer> entry : result.entrySet()){
                    System.out.println(entry.getKey() + " - " + entry.getValue());
                }
            }
        };

        print.accept(format);
    }
}