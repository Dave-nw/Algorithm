package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int max = 3;
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            int number = Integer.parseInt(br.readLine());
            numbers[i] = number;
            if (max < number) {
                max = number;
            }
        }

        int[] triangularNumbers = new int[45];
        for (int i = 1; i < triangularNumbers.length; i++) {
            triangularNumbers[i] = i * (i + 1) / 2;
        }

        for (int number : numbers) {
            if (solution(number, triangularNumbers)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    private static boolean solution(int number, int[] triangularNumbers) {
        for (int i = 1; i < triangularNumbers.length && triangularNumbers[i] < number; i++) {
            for (int j = i; j < triangularNumbers.length && triangularNumbers[j] < number; j++) {
                for (int k = j; k < triangularNumbers.length && triangularNumbers[k] < number; k++) {
                    int sum = triangularNumbers[i] + triangularNumbers[j] + triangularNumbers[k];
                    if (sum == number) {
                        return true;
                    } else if (number < sum ) {
                        break;
                    }
                }
            }
        }
        return false;
    }
}
