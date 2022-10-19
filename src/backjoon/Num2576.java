package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Num2576 {
    final static int SIZE = 7;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        solution(numbers);
    }

    private static void solution(int[] numbers) {
        List<Integer> oddNumbers = createOddNumbers(numbers);
        if (oddNumbers.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(sumOfNumbers(oddNumbers));
            System.out.println(minimumOfNumbers(oddNumbers));
        }
    }

    private static int minimumOfNumbers(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    private static int sumOfNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static List<Integer> createOddNumbers(int[] numbers) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            if (numbers[i] % 2 == 1) {
                result.add(numbers[i]);
            }
        }
        return result;
    }
}
