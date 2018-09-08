import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudends = Integer.valueOf(scanner.nextLine());

        TreeMap<String, Double> graduationList = new TreeMap<>();

        for (int i = 0; i < numberOfStudends; i++) {
            String nameOfStudent = scanner.nextLine();
            String[] scoresOfStudent = scanner.nextLine().split(" ");
            double studentAverageScore = 0;

            for (int j = 0; j < scoresOfStudent.length; j++) {
                studentAverageScore += Double.parseDouble(scoresOfStudent[j]);
            }

            studentAverageScore /= scoresOfStudent.length;

            graduationList.put(nameOfStudent, studentAverageScore);
        }

        for (String student : graduationList.keySet()) {
            System.out.printf("%s is graduated with %s %n", student, graduationList.get(student));
        }
    }
}
