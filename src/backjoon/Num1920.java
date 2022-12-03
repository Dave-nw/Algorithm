package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Num1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        Map<Integer, Integer> targets = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            int number = Integer.parseInt(st.nextToken());
            targets.put(number, targets.getOrDefault(number, 0) + 1);
        }

        int cycle = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cycle; i++) {
            int number = Integer.parseInt(st.nextToken());
            bw.write(0 < targets.getOrDefault(number, 0) ? "1" : "0");
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
