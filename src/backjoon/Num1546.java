package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] numbers = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        int sum = Arrays.stream(numbers).sum();
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println((double) sum / max * 100 / size);
    }
}
