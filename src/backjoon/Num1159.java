package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Num1159 {
    final static String GIVE_UP = "PREDAJA";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        Map<Character, Integer> players = new HashMap<>();
        for (int i = 0; i < size; i++) {
            char firstLetter = br.readLine().charAt(0);
            players.put(firstLetter, players.getOrDefault(firstLetter, 0) + 1);
        }

        StringBuffer result = new StringBuffer();
        for (Character c: players.keySet()) {
            if (5 <= players.get(c)) {
                result.append(c);
            }
        }

        if (result.length() == 0) {
            System.out.println(GIVE_UP);
        }else {
            System.out.println(result);
        }
    }
}
