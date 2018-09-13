import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class СръбскоUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, Long>> singerAndVenues = new LinkedHashMap<>();

        String pattern = "(.*?) @(.*?) (\\d+) (\\d+)";
        Pattern r = Pattern.compile(pattern);

        String input = scanner.nextLine();
        String[] inputToArray = input.split("@");

        while(!input.equals("End")){
            Matcher m = r.matcher(input);

            String singer = inputToArray[0];
            List<String> aboutSinger = JoinStrings(inputToArray[1].split(" "));

            if(!m.find()){
                input = scanner.nextLine();
                inputToArray = input.split("@");

                continue;
            }
            if(aboutSinger.size() < 3){
                input = scanner.nextLine();
                inputToArray = input.split("@");

                continue;
            }

            String venue = aboutSinger.get(0);
            long ticketPrice = Long.parseLong(aboutSinger.get(1));
            long ticketCount = Long.parseLong(aboutSinger.get(2));
            long countTotal = ticketPrice * ticketCount;

            if(!singerAndVenues.containsKey(venue)){
                singerAndVenues.put(venue, new LinkedHashMap<>());
            }
            if(!singerAndVenues.get(venue).containsKey(singer)){
                singerAndVenues.get(venue).put(singer, 0L);
            }

            singerAndVenues.get(venue).put(singer,
                    singerAndVenues.get(venue).get(singer) + countTotal);

            input = scanner.nextLine();
            inputToArray = input.split("@");
        }

        for (String venue : singerAndVenues.keySet()) {
            System.out.println(venue);

            singerAndVenues.get(venue).entrySet().stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).forEach(entry -> {
                System.out.printf("#  %s-> %d%n", entry.getKey(), entry.getValue());
            });
        }
    }

    static List<String> JoinStrings(String[] array){
        List<String> name = new ArrayList<>();
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            try{
                long check = Long.parseLong(array[i]);
                resultList.add(array[i]);
            }
            catch (Exception e){
                name.add(array[i]);
            }
        }

        String fullName = String.join(" ", name);
        resultList.add(0, fullName);

        return resultList;
    }
}