package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2460 {
    final static int NUM_OF_STATIONS = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int people = 0;
        for (int i = 0; i < NUM_OF_STATIONS; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            people -= Integer.parseInt(st.nextToken());
            people += Integer.parseInt(st.nextToken());

            if (max < people) {
                max = people;
            }
        }
        System.out.println(max);
    }
}
