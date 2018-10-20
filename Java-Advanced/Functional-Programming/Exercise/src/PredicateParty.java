import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<String> peopleComing = Arrays.asList(input);

        String command = scanner.nextLine();

        while(!command.equals("Party!")){
            String[] splitCommand = command.split(" ");
            List<String> newList = new ArrayList<>();

            String make = splitCommand[0];
            String criteria = splitCommand[1];
            String find = splitCommand[2];

            if(make.equals("Remove")){
                switch (criteria){
                    case "StartsWith":
                        for (String s : peopleComing) {
                            if(!s.startsWith(find)){
                                newList.add(s);
                            }
                        }
                        break;
                    case "EndsWith":
                        for (String s : peopleComing) {
                            if(!s.endsWith(find)){
                                newList.add(s);
                            }
                        }
                        break;
                    case "Length":
                        for (String s : peopleComing) {
                            if(s.toCharArray().length != Integer.valueOf(find)){
                                newList.add(s);
                            }
                        }
                        break;
                }
            }
            if(make.equals("Double")){
                switch (criteria){
                    case "StartsWith":
                        for (String s : peopleComing) {
                            newList.add(s);
                            if(s.startsWith(find)){
                                int indexOfPerson = peopleComing.indexOf(s);
                                newList.add(indexOfPerson, s);
                            }
                        }
                        break;
                    case "EndsWith":
                        for (String s : peopleComing) {
                            newList.add(s);
                            if(s.endsWith(find)){
                                int indexOfPerson = peopleComing.indexOf(s);
                                newList.add(indexOfPerson, s);
                            }
                        }
                        break;
                    case "Length":
                        for (String s : peopleComing) {
                            int stringLength = s.toCharArray().length;
                            newList.add(s);
                            if(stringLength == Integer.valueOf(find)){
                                int indexOfPerson = peopleComing.indexOf(s);
                                newList.add(indexOfPerson, s);
                            }
                        }
                        break;
                }
            }
            peopleComing = newList;

            command = scanner.nextLine();
        }

        if(peopleComing.size() > 0){
            System.out.println(String.join(", ", peopleComing) + " are going to the party!");
        }
        else{
            System.out.println("Nobody is going to the party!");
        }
    }
}