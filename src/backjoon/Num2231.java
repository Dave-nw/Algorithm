package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int[] numbers = new int[number];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int min = Integer.MAX_VALUE;
        for (int i = numbers.length - 1; 0 <= i; i--) {
            if (solution(numbers[i], number) && numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min == Integer.MAX_VALUE ? 0 : min);
    }

    private static boolean solution(int number, int target) {
        int quotient = number;
        int sum = number;
        while (0 < quotient) {
            sum += quotient % 10;
            quotient /= 10;
        }

        return sum == target;
    }
}
