package inflearn.sorting;

import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = s.nextInt();
        }

        for (int cycle = 1; cycle < size; cycle++) {
            for (int index = cycle ; 0 < index; index--) {
                if (numbers[index] < numbers[index - 1]) {
                    int tmp = numbers[index];
                    numbers[index] = numbers[index - 1];
                    numbers[index - 1] = tmp;
                } else {
                    break;
                }
            }
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}


