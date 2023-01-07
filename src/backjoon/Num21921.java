package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num21921 {
    final static String LOWEST = "SAD";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] visitors = new int[n];
        for (int i = 0; i < n; i++) {
            visitors[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        int count = 1;
        for (int i = 0; i < x; i++) {
            result += visitors[i];
        }

        int sum = result;
        for (int i = x; i < visitors.length; i++) {
            sum += visitors[i] - visitors[i - x];
            if (result < sum) {
                count = 1;
                result = sum;
            } else if (result == sum) {
                count++;
            }
        }
        if (result == 0) {
            System.out.println(LOWEST);
        } else {
            System.out.println(result);
            System.out.println(count);
        }
    }
}
