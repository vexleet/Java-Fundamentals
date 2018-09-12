import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, TreeMap<Long, List<String>>> logs = new TreeMap<>();

        long lengthOfLogs = Long.parseLong(scanner.nextLine());

        for (long i = 0; i < lengthOfLogs; i++) {
            String[] currentLog = scanner.nextLine().split(" ");

            String currentIp = currentLog[0];
            String currentUser = currentLog[1];
            long duration = Long.parseLong(currentLog[2]);

            if(!logs.containsKey(currentUser)){
                logs.put(currentUser, new TreeMap<>());
                logs.get(currentUser).put(duration, new ArrayList<>());
                logs.get(currentUser).get(duration).add(currentIp);
            }
            else {
                long keys = duration;
                List<String> values = new ArrayList<>();
                values.add(currentIp);
                boolean check = false;
                long currentKey = 0;

                for (Long user : logs.get(currentUser).keySet()) {
                    if(check == false){
                    }
                }
            }
        }
    }
}
