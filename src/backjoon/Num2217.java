package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int[] ropes = new int[size];
        for (int i = 0; i < size; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ropes);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ropes.length; i++) {
            int number = ropes[i] * (ropes.length - i);
            max = Math.max(number, max);
        }
        System.out.println(max);
    }
}
