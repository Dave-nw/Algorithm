package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        boolean[] primeArr = new boolean[end];
        for (int i = 0; i < primeArr.length; i++) {
            if (isPrime(i + 1)) {
                primeArr[i] = true;
            }
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean flag = false;
        for (int i = start - 1; i < end; i++) {
            if (primeArr[i]) {
                flag = true;
                int number = i + 1;
                sum += number;
                if (number < min) {
                    min = number;
                }
            }
        }

        if (flag) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }

    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < Math.abs(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
