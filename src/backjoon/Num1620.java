package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Num1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfPokemons = Integer.parseInt(st.nextToken());
        int numberOfAnswers = Integer.parseInt(st.nextToken());
        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < numberOfPokemons; i++) {
            String pokemon = br.readLine();
            map1.put(i + 1, pokemon);
            map2.put(pokemon, i + 1);
        }

        for (int i = 0; i < numberOfAnswers; i++) {
            String answer = br.readLine();
            if (Character.isDigit(answer.charAt(0))) {
                int number = Integer.parseInt(answer);
                System.out.println(map1.get(number));
            }else {
                System.out.println(map2.get(answer));
            }
        }
    }
}
