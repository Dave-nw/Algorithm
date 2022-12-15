package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Num11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int cycle = 0; cycle < size; cycle++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (map.isEmpty()) {
                    sb.append(0 + "\n");
                } else {
                    int number = map.lastKey();
                    if (1 < map.get(number)) {
                        map.put(number, map.get(number) - 1);
                    }else{
                        map.remove(number);
                    }
                    sb.append(number + "\n");
                }

            } else {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }
        System.out.println(sb);
    }
}
