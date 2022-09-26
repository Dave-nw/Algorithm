package inflearn.twopointers;

import java.util.Arrays;
import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = createIntArr(scanner);
        int[] arr2 = createIntArr(scanner);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer1 < arr1.length && pointer2 < arr2.length) {
            if (arr1[pointer1] < arr2[pointer2]) {
                pointer1 ++;
            }else if (arr1[pointer1] == arr2[pointer2]) {
                System.out.print(arr1[pointer1] + " ");
                pointer1 ++;
                pointer2 ++;
            }else {
                pointer2 ++;
            }
        }

    }

    private static int[] createIntArr(Scanner scanner) {
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
