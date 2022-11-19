package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Num1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        int max = Integer.MIN_VALUE;
        char result = ' ';
        for (char c: map.keySet()) {
            if (max < map.get(c)) {
                count = 1;
                max = map.get(c);
                result = c;
            } else if (max == map.get(c)) {
                count ++;
            }
        }

        if (count == 1) {
            System.out.println(result);
        }else {
            System.out.println("?");
        }
    }
}
