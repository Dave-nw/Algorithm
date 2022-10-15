package inflearn.sorting;

import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i : sort(numbers)) {
            System.out.print(i + " ");
        }
    }

    private static int[] sort(int[] numbers) {
        for (int left = 0; left < numbers.length - 1; left++) {
            for (int right = left + 1; right < numbers.length; right++) {
                if (numbers[right] < numbers[left]) {
                    int tmp = numbers[left];
                    numbers[left] = numbers[right];
                    numbers[right] = tmp;
                }
            }
        }
        return numbers;
    }
}
