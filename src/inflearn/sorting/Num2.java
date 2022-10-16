package inflearn.sorting;

import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int num : sort(numbers)) {
            System.out.print(num + " ");
        }
    }

    private static int[] sort(int[] numbers) {
        for (int cycle = 0; cycle < numbers.length - 1; cycle++) {
            boolean swap = false;
            for (int index = 0; index < numbers.length - 1 - cycle; index++) {
                if (numbers[index + 1] < numbers[index]) {
                    int tmp = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = tmp;
                    swap = true;
                }
            }

            if (!swap) {
                break;
            }
        }
        return numbers;
    }
}
