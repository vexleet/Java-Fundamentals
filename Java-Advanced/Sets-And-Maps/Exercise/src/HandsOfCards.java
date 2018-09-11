import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> powerOfCards = new LinkedHashMap<>() {
            {
                put("2", 2);
                put("3", 3);
                put("4", 4);
                put("5", 5);
                put("6", 6);
                put("7", 7);
                put("8", 8);
                put("9", 9);
                put("10", 10);
                put("J", 11);
                put("Q", 12);
                put("K", 13);
                put("A", 14);
            }
        };

        LinkedHashMap<String, Integer> powerOfTypes = new LinkedHashMap<>(){
            {
                put("S", 4);
                put("H", 3);
                put("D", 2);
                put("C", 1);
            }
        };

        LinkedHashMap<String, String> drawnCardOfPlayers = new LinkedHashMap<>();

        LinkedHashMap<String, Integer> players = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split(": ");

        while(!input[0].equals("JOKER")){
            String name = input[0];
            String[] cardsSplitArray = input[1].split(", ");

            LinkedHashSet<String> cards = new LinkedHashSet<>();

            Collections.addAll(cards, cardsSplitArray);

            if(!drawnCardOfPlayers.containsKey(name)){
                drawnCardOfPlayers.put(name, "");
            }

            for (String card : cards) {

                if(drawnCardOfPlayers.get(name).contains(card)){
                    continue;
                }
                else{
                    drawnCardOfPlayers.put(name, drawnCardOfPlayers.get(name) + " " + card);
                }

                int currentCardPower = powerOfCards.get(card.substring(0, card.length() - 1));
                int currentType = powerOfTypes.get(Character.toString(card.charAt(card.length() - 1)));

                int powerOfDrawnHand = currentCardPower * currentType;

                if(players.containsKey(name)){
                    int value = powerOfDrawnHand + players.get(name);

                    players.put(name, value);
                }
                else{
                    players.put(name, powerOfDrawnHand);
                }
            }

            input = scanner.nextLine().split(": ");
        }

        for (String currentPlayer : players.keySet()) {
            System.out.printf("%s: %s%n", currentPlayer, players.get(currentPlayer));
        }
    }
}
