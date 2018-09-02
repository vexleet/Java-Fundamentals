import java.util.Scanner;

public class GameOfNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPlayers = scanner.nextInt();

        String playerNameWithHighestPoints = "";
        long playerScoreWithHighestPoints = Integer.MIN_VALUE;

        for(int i = 0; i < numberOfPlayers; i++){
            String currentPlayer = scanner.next();
            long initialScore = scanner.nextLong();

            long sumOfcurrentPlayer = initialScore;

            for(int j = 0; j < currentPlayer.length(); j++){
                int currentLetter = currentPlayer.charAt(j);

                if(currentLetter % 2 == 0){
                    sumOfcurrentPlayer += currentLetter;
                }
                else{
                    sumOfcurrentPlayer -= currentLetter;
                }
            }

            if(sumOfcurrentPlayer > playerScoreWithHighestPoints){
                playerNameWithHighestPoints = currentPlayer;
                playerScoreWithHighestPoints = sumOfcurrentPlayer;
            }

        }

        System.out.printf("The winner is %s - %s points", playerNameWithHighestPoints, playerScoreWithHighestPoints);
    }
}
