package inflearn.sorting;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Num5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(solution(size, numbers));
    }

    private static Character solution(int size, int[] numbers) {
        if (isUnique(size, numbers)) {
            return 'U';
        }
        return 'D';
    }

    private static boolean isUnique(int size, int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int number : numbers) {
            set.add(number);
        }
        if (size == set.size()) {
            return true;
        }
        return false;
    }
}
