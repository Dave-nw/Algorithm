package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Num20922 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] numbers = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> map = new HashMap<>();
        int p1 = 0;
        int p2 = 1;
        int max = 0;
        map.put(numbers[p1], 1);
        while (p2 < numbers.length) {
            if (map.getOrDefault(numbers[p2], 0) < k) {
                int number = numbers[p2];
                map.put(number, map.getOrDefault(number, 0) + 1);
                int length = p2 - p1 + 1;
                if (max < length) {
                    max = length;
                }
                p2++;
            } else {
                int number = numbers[p1];
                map.put(number, map.get(number) - 1);
                p1++;
            }
        }
        System.out.println(max);
    }
}
