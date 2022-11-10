package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cycle = Integer.parseInt(br.readLine());
        for (int i = 0; i < cycle; i++) {
            int[] numbers = new int[10];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(numbers);
            System.out.println(numbers[7]);
        }
    }
}
