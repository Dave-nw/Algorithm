package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            int number = Integer.parseInt(br.readLine());
            System.out.println(solution(number));
        }
    }

    private static String solution(int number) {
        int count = 0;
        StringBuffer sb = new StringBuffer();
        while (0 < number) {
            int remainder = number % 2;
            if (remainder == 1) {
                sb.append(count + " ");
            }
            count++;
            number /= 2;
        }
        return sb.toString();
    }
}
