package inflearn.twopointers;

import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int sum = scanner.nextInt();
        int count = 0;
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int number = 0;
        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer2 < size) {
            number += nums[pointer2];
            if (number < sum) {
                pointer2 ++;
            } else if (number == sum) {
                count ++;
                number -= nums[pointer1];
                pointer1++;
                pointer2++;
            }else {
                number -= nums[pointer1];
                number -= nums[pointer2];
                pointer1 ++;
            }
        }
        System.out.println(count);
    }
}
