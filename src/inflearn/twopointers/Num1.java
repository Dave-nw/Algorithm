package inflearn.twopointers;

import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1 = scanner.nextInt();
        int[] numArr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            numArr1[i] = scanner.nextInt();
        }
        int size2 = scanner.nextInt();
        int[] numArr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            numArr2[i] = scanner.nextInt();
        }

        int resultSize = size1 + size2;
        int pointer1 = 0;
        int pointer2 = 0;
        for (int i = 0; i < resultSize; i++) {
            if (pointer1 == size1) {
                System.out.print(numArr2[pointer2] + " ");
                pointer2++;
            } else if (pointer2 == size2) {
                System.out.print(numArr1[pointer1] + " ");
                pointer1++;
            } else if (numArr1[pointer1] < numArr2[pointer2]) {
                System.out.print(numArr1[pointer1] + " ");
                pointer1++;
            } else {
                System.out.print(numArr2[pointer2] + " ");
                pointer2++;
            }
        }
    }
}
