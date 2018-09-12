import java.util.*;

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
                        keys += logs.get(currentUser).ceilingKey(user);
                        currentKey = logs.get(currentUser).ceilingKey(user);
                        check = true;
                    }
                    for (String ip : logs.get(currentUser).get(user)) {
                        values.add(ip);
                    }
                }

                logs.get(currentUser).remove(currentKey);
                logs.get(currentUser).put(keys, values);
            }
        }


        List<String> list =  new ArrayList<>(logs.keySet());
        Collections.sort(list);

        for (String s : list) {
            var test = logs.get(s).values().iterator().next();
            var getIps = new TreeSet<>(logs.get(s).values().iterator().next());

            for (Long aLong : logs.get(s).keySet()) {
                System.out.printf("%s: %s [%s]%n", s, logs.get(s).ceilingKey(aLong), String.join(", ", getIps));
            }
        }
    }
}
