package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int number = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int count = 0;
        int result = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
            if (count == target) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
