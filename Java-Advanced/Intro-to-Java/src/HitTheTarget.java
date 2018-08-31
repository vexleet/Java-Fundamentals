import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = scanner.nextInt();

        for(int i = 1; i<=20;i++){
            for(int j = 1; j<=20;j++){
                int sum = i + j;
                int subtract = i - j;

                if(sum == target){
                    System.out.printf("%s + %s = %s%n", i, j, target);
                }
                else if(subtract == target){
                    System.out.printf("%s - %s = %s%n", i, j, target);
                }
            }
        }
    }
}
