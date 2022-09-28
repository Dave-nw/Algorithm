package inflearn.twopointers;

import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int days = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < days; i++) {
            sum += nums[i];
        }

        int max = sum;
        for (int i = days; i < size; i++) {
            sum = sum - nums[i-days] + nums[i];
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
