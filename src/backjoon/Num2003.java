package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int[] numbers = new int[size];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int lp = 0;
        int rp = 0;
        int count = 0;
        int sum = 0;
        while (lp < numbers.length && rp < numbers.length) {
            sum += numbers[rp];
            if (sum < target) {
                rp++;
            } else if (sum == target) {
                count++;
                sum -= numbers[lp];
                sum -= numbers[rp];
                lp++;
            } else {
                sum -= numbers[lp];
                sum -= numbers[rp];
                lp++;
            }
        }
        System.out.println(count);
    }
}
