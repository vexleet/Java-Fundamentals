import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int getMaxLengh = Math.max(input[0].length(), input[1].length());
        long sum = 0;

        for(int i = 0; i < getMaxLengh; i++){
            if(input[0].length() <= i){
                sum += input[1].charAt(i);
            }
            else if(input[1].length() <= i){
                sum += input[0].charAt(i);
            }
            else{
                sum += input[1].charAt(i) * input[0].charAt(i);
            }
        }

        System.out.println(sum);
    }
}
