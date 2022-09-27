package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(strArr[i]);
            if (num < min) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }
        System.out.println(min * max);
    }
}
