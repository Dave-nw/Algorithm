package inflearn.twopointers;

import java.util.Scanner;

public class Num6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int count = scanner.nextInt();
        int[] numArr = new int[size];
        for (int i = 0; i < size; i++) {
            numArr[i] = scanner.nextInt();
        }

        int remaining = count;
        int lp = 0;
        int max = Integer.MIN_VALUE;
        int sum;
        for (int rp = 0; rp < size; rp++) {
            if (numArr[rp] == 0) {
                remaining--;
                while (remaining < 0) {
                    if (numArr[lp] == 0) {
                        remaining++;
                    }
                    lp++;
                }
            }
            sum = rp - lp + 1;
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
