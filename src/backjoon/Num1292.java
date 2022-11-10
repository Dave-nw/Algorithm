package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int count = 0;
        int number = 1;
        int sum = 0;
        for (int i = 1; i <= end; i++) {
            if (count < number) {
                count++;
            } else {
                number++;
                count = 1;
            }
            if (start <= i) {
                sum += number;
            }
        }
        System.out.println(sum);

    }
}
