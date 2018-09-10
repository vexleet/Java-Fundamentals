import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        LinkedHashMap<String, LinkedHashMap<String, Integer>> users = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("[= ]+");
        int counter = 0;

        while(!input[0].equals("end")){
            String ip = input[1];
            String user = input[input.length - 1];

            if(users.containsKey(user) == false){
                users.put(user, new LinkedHashMap<>());
            }

            if(users.get(user).containsKey(ip) == false){
                users.get(user).put(ip, 1);
            }
            else{
                users.get(user).put(ip, users.get(user).get(ip) + 1);
            }

            input = scanner.nextLine().split("[= ]+");
        }

        var usersSort = new ArrayList<>(users.keySet());
        Collections.sort(usersSort);

        for (String pair : usersSort) {
            System.out.printf("%s: %n", pair);

            for(String ip : users.get(pair).keySet()){
                if(counter < users.get(pair).size() - 1){
                    System.out.printf("%s => %s, ", ip, users.get(pair).get(ip));
                }
                else {
                    System.out.printf("%s => %s. %n", ip, users.get(pair).get(ip));
                }
                counter++;
            }

            counter = 0;
        }
    }
}
