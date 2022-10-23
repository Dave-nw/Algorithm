package inflearn.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Num8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int target = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(solution(numbers, target, 0) + 1);
    }

    private static int solution(int[] numbers, int target, int plus) {
        if (numbers.length == 1 && numbers[0] == target) {
            return plus;
        }
        int medium = numbers.length / 2;
        if (numbers[medium] == target) {
            return medium + plus;
        } else {
            if (target < numbers[medium]) {
                return solution(Arrays.copyOf(numbers, medium), target, plus);
            } else {
                plus += medium;
                return solution(Arrays.copyOfRange(numbers, medium, numbers.length), target, plus);
            }
        }
    }
}
