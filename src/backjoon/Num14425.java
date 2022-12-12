package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> words = new HashSet<>();
        for (int i = 0; i < n; i++) {
            words.add(br.readLine());
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            String target = br.readLine();
            if (words.contains(target)){
                count++;
            }
        }
        System.out.println(count);
    }
}
