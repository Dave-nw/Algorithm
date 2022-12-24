package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] withdraw = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            withdraw[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(withdraw);

        int result = 0;
        int sum = 0;
        for (int i = 0; i < withdraw.length; i++) {
            sum += withdraw[i];
            result += sum;
        }
        System.out.println(result);
    }
}
