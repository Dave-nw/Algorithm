package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfDays = Integer.parseInt(st.nextToken());
        int size = Integer.parseInt(st.nextToken());

        int[] temperatures = new int[numberOfDays];
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < temperatures.length; i++) {
            int number = Integer.parseInt(st.nextToken());
            temperatures[i] = number;
            if (i < size - 1) {
                sum += number;
            }
        }

        int max = Integer.MIN_VALUE;
        int lp = 0;
        int rp = size - 1;
        while (rp < temperatures.length) {
            sum += temperatures[rp];
            if (max < sum) {
                max = sum;
            }
            sum -= temperatures[lp];
            lp++;
            rp++;
        }
        System.out.println(max);
    }
}
