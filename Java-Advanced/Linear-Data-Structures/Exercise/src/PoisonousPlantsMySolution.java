import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//THIS SOLUTION GIVES 77/100 (TIME LIMIT)
//THE OTHER ONE HAS NO PROBLEMS BUT IT'S COPIED
//TAKEN FROM - https://pastebin.com/edZqtUr2

public class PoisonousPlantsMySolution {
    public static void main(String[] args)  throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));

        int numberOfPlants = Integer.valueOf(buffer.readLine());

        String[] input = buffer.readLine().split(" ");

        List<Integer> planstWithPesticides = new ArrayList<>();
        int daysCounter = 0;

        for(String s : input) planstWithPesticides.add(Integer.valueOf(s));
        boolean hasDied = true;

        while(hasDied){
            hasDied = false;

            for(int i = planstWithPesticides.size() - 1; i > 0; i--){
                if(planstWithPesticides.get(i) > planstWithPesticides.get(i - 1)){
                    planstWithPesticides.remove(i);

                    hasDied = true;
                }
            }
            if(hasDied) {
                daysCounter++;
            }
        }

        System.out.println(daysCounter);
    }
}