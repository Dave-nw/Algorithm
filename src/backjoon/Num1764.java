package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> names = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            names.add(name);
        }

        int count = 0;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if (names.contains(name)){
                count++;
                result.add(name);
            }
        }
        Collections.sort(result);
        System.out.println(count);
        for (String name:
             result) {
            System.out.println(name);
        }
    }
}
