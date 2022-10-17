package inflearn.sorting;

import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int count = scanner.nextInt();

        int[] cache = new int[size];
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            int index = contain(cache, number);
            if (index != -1) {
                put(cache, index, number);
            } else {
                put(cache, number);
            }

        }
        for (int num: cache) {
            System.out.print(num + " ");
        }
    }

    private static void put(int[] cache, int index, int number) {
        for (int i = index - 1; 0 <= i; i--) {
            cache[i + 1] = cache[i];
        }
        cache[0] = number;
    }

    private static void put(int[] cache, int number) {
        for (int i = cache.length - 2; 0 <= i; i--) {
            if (cache[i] != 0) {
                cache[i + 1] = cache[i];
            }
        }
        cache[0] = number;
    }

    private static int contain(int[] cache, int number) {
        for (int index = 0; index < cache.length; index++) {
            if (number == cache[index]) {
                return index;
            }
        }
        return -1;
    }
}
